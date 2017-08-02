package challenge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
//import org.h2.jdbc.JdbcSQLException;

import challenge.bean.Message;
import challenge.bean.Person;
import challenge.bean.MostPopularFollowerByUser;
import challenge.service.ITwitterService;
import java.util.List;


/*
 *********Please see API.txt for full documentation.*******
 */
@RestController
public class Controller {

    @Autowired
    private ITwitterService twitterService;

    //Get the 'timeline' data (messages posted by people the user is following as well as their own message)
    @RequestMapping(value = "/mymessages", method = RequestMethod.GET)
    public List<Message> getMessages(@RequestParam(required=false, value="search") String searchTerm, Authentication authentication) {
    	String userHandle = authentication.getName();
    	
    	List<Message> messagesFromService = twitterService.getMessages(userHandle, searchTerm);
		return messagesFromService;
    }

    //Get the data for both the people the user is following, and the people following the user. This is
    //packaged as a "FollowersData" object to help differentiate between the two groups of people.
    @RequestMapping(value = "/followers", method = RequestMethod.GET)
    public FollowersData getFollowers(Authentication authentication) {
    	String userHandle = authentication.getName();
    	
    	FollowersData followersData = new FollowersData();
    	
    	List<Person> followers = twitterService.getFollowers(userHandle);
    	List<Person> friends = twitterService.getFollowing(userHandle);
    	followersData.followers = followers;
    	followersData.following = friends;

    	return followersData;
    }

    //Adds the user to the userToFollow's list of followers. userToFollow is the handle of that user.
    @RequestMapping(value = "/followers", method = RequestMethod.POST)
    public ResponseEntity<String> follow(@RequestParam(required=true, value="userToFollow") String userToFollow, Authentication authentication) {
    	String userHandle = authentication.getName();
    	
    	//user tried to add themselves as a follower; return error
    	if(userHandle.equals(userToFollow)) {
    		return new ResponseEntity<String>("Error: A user is trying to add themself as their own follower", HttpStatus.PRECONDITION_FAILED);
    	}
    	else{
    		twitterService.addFollower(userHandle, userToFollow);
    		return new ResponseEntity<String>(userHandle+" is now following "+userToFollow, HttpStatus.OK);
    	}
    }

    //Removes the relationship between the user (follower) and userToUnfollow(followee)
    @RequestMapping(value = "/followers", method = RequestMethod.DELETE)
    public ResponseEntity<String> unfollow(@RequestParam(required=true, value="userToUnfollow") String userToUnfollow, Authentication authentication) {
    	String userHandle = authentication.getName();
    	
    	twitterService.removeFollower(userHandle, userToUnfollow);
    	return new ResponseEntity<String>(userHandle+" is no longer following "+userToUnfollow, HttpStatus.OK);
    }
    
    //Returns a list of each user, paired with their most popular follower (or
    //multiple followers, if there is a tie). 
    @RequestMapping(value = "/mostpopularfollowers", method = RequestMethod.GET)
    public List<MostPopularFollowerByUser> getMostPopularFollowersData(Authentication authentication) {
    	
    	List<MostPopularFollowerByUser> mostPopularFollowersData = twitterService.getMostPopularFollowersData();
    	return mostPopularFollowersData;
    }


    /*
     * Data structure that gets sent as JSON.
     * The two fields help to differentiate between the people that follow the user
     * and the people the user is following.
     */
    public class FollowersData{
    	public List<Person> followers;
    	public List<Person> following;
    }

}
