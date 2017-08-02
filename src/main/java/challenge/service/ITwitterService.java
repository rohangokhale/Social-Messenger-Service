package challenge.service;

import challenge.bean.Person;
import challenge.bean.Message;
import challenge.bean.MostPopularFollowerByUser;

import java.util.List;

public interface ITwitterService {
	
	/*
	 * Gets all messages authored by the user as well as the people they follow
	 */
	public List<Message> getMessages(String handle, String searchTerm);
	
	/*
	 * Gets all of the followers of the specified user
	 */
	public List<Person> getFollowers(String handle);
	
	/*
	 * Gets all of the people that follow the specified user
	 */
	public List<Person> getFollowing(String handle);
	
	/*
	 * Adds the specified follower-followee relationship to the followers table
	 */
	public void addFollower(String userHandle, String userToFollowHandle);
	
	/*
	 * Removes the specified follower-followee relationship from the followers table
	 */
	public void removeFollower(String userHandle, String userToUnfollowHandle);
	
	/*
	 * Gets a list of the users paired with their most popular followers.
	 * Popularity is simply measured by the number of people that follow a user.
	 * If a user has X number of followers that are tied for most popular, then
	 * X MostPopularFollowerByUser objects will be added to the list, one for each
	 * follower.
	 */
	public List<MostPopularFollowerByUser> getMostPopularFollowersData();
	

}
