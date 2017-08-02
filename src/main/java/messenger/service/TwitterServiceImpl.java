package messenger.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import messenger.bean.Message;
import messenger.bean.MostPopularFollowerByUser;
import messenger.bean.Person;
import messenger.dao.TwitterDAO;
import messenger.service.ITwitterService;

@Service
public class TwitterServiceImpl implements ITwitterService{
	
	@Autowired
	private NamedParameterJdbcTemplate jtm;
	
	TwitterDAO twitterDAO = new TwitterDAO();
	
	public List<Message> getMessages(String handle, String searchTerm){
		List<Message> messages = twitterDAO.getMessages(jtm, handle, searchTerm);
		return messages;
	}
	
	public List<Person> getFollowers(String handle){
		List<Person> followers = twitterDAO.getFollowers(jtm, handle);
		return followers;
	}
	
	public List<Person> getFollowing(String handle){
		List<Person> friends = twitterDAO.getFollowing(jtm, handle);
		return friends;
	}
	
	public void addFollower(String userHandle, String userToFollowHandle) {
		twitterDAO.addFollower(jtm, userHandle, userToFollowHandle);
	}
	
	public void removeFollower(String userHandle, String userToUnfollowHandle) {
		twitterDAO.removeFollower(jtm, userHandle, userToUnfollowHandle);
	}
	
	public List<MostPopularFollowerByUser> getMostPopularFollowersData(){
		List<MostPopularFollowerByUser> mostPopularFollowersData= twitterDAO.getMostPopularFollowers(jtm);
		return mostPopularFollowersData;
	}

}
