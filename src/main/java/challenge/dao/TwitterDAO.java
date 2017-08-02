package challenge.dao;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;

import challenge.mappers.MessageMapper;
import challenge.mappers.MostPopularFollowerByUserMapper;
import challenge.mappers.PersonMapper;
import service.bean.Message;
import service.bean.MostPopularFollowerByUser;
import service.bean.Person;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;


@Service
public class TwitterDAO {

	/*
	 * Queries the database for all messages authored by the user as well as the people they follow
	 */
public List<Message> getMessages(NamedParameterJdbcTemplate jtm, String handle, String searchTerm) {  
		
		String sql;
		if(searchTerm == null) {
			sql = "SELECT 'self' flag_self_friends, messages.id, person_id, content FROM messages INNER JOIN people ON messages.person_id=people.id WHERE people.handle=:handle "
			+ "UNION "
			+ "SELECT 'friends' flag_self_friends, messages.id, person_id, content FROM messages WHERE person_id IN "
			+ "(SELECT people.id FROM people INNER JOIN followers ON followers.person_id=people.id WHERE followers.follower_person_id="
			+ "(SELECT people.id FROM people WHERE handle=:handle))";
			
			
			List<Message> sentMessages = jtm.query(sql, new MapSqlParameterSource("handle", handle), new MessageMapper());
			return sentMessages;
		}

		else {
			sql = "SELECT 'self' flag_self_friends, messages.id, person_id, content FROM messages INNER JOIN people ON messages.person_id=people.id WHERE people.handle='"+handle+"' AND content LIKE '%" + searchTerm + "%'"
			+ "UNION "
			+ "SELECT 'friends' flag_self_friends, messages.id, person_id, content FROM messages WHERE person_id IN "
			+ "(SELECT people.id FROM people INNER JOIN followers ON followers.person_id=people.id WHERE followers.follower_person_id="
			+ "(SELECT people.id FROM people WHERE handle='"+handle+"')) "
			+ "AND content LIKE '%"+searchTerm+"%'";
			
			List<Message> sentMessages = jtm.query(sql, new MessageMapper());
			return sentMessages;
		}
					
		
	}
	
	/*
	 * Queries the database for all of the followers of the specified user
	 */
	public List<Person> getFollowers(NamedParameterJdbcTemplate jtm, String handle) {  
		String sql = "SELECT people.id, handle, name FROM people INNER JOIN followers ON followers.follower_person_id=people.id WHERE followers.person_id="
				+ "(SELECT people.id FROM people WHERE handle='"+handle+"')";
		List<Person> followers = jtm.query(sql, new PersonMapper());
		return followers;
	}
	
	
	/*
	 * Queries the database for all of the people that follow the specified user
	 */
	public List<Person> getFollowing(NamedParameterJdbcTemplate jtm, String handle) {
		String sql = "SELECT people.id, handle, name FROM people INNER JOIN followers ON followers.person_id=people.id WHERE followers.follower_person_id="
				+ "(SELECT people.id FROM people WHERE handle='"+handle+"')";
		List<Person> friends = jtm.query(sql, new PersonMapper());
		return friends;
	}
	
	/*
	 * Adds the specified follower-followee relationship to the followers table
	 */
	public void addFollower(NamedParameterJdbcTemplate jtm, String userHandle, String userToFollowHandle) {
		Map<String, String> namedParameters = new HashMap<String, String>();
		namedParameters.put("follower_person_id", userHandle);
		namedParameters.put("person_id", userToFollowHandle);
		String sql = "INSERT INTO followers(person_id, follower_person_id) "
				+ "VALUES (SELECT people.id FROM people WHERE handle=:person_id,"
				+ "SELECT people.id FROM people WHERE handle=:follower_person_id)";
		int result = jtm.update(sql, namedParameters);
		System.out.println(result);
		
	}
	
	/*
	 * Removes the specified follower-followee relationship from the followers table
	 */
	public void removeFollower(NamedParameterJdbcTemplate jtm, String userHandle, String userToUnfollowHandle) {
		Map<String, String> namedParameters = new HashMap<String, String>();
		namedParameters.put("follower_person_id", userHandle);
		namedParameters.put("person_id", userToUnfollowHandle);
		String sql = "DELETE FROM followers WHERE person_id=(SELECT people.id FROM people WHERE handle=:person_id)"
				+ "AND follower_person_id=(SELECT people.id FROM people WHERE handle=:follower_person_id)";
		int result = jtm.update(sql, namedParameters);
		System.out.println(result);
	}
	
	/*
	 * Queries the database for a list of the users paired with their most popular followers.
	 * Popularity is simply measured by the number of people that follow a user.
	 */
	public List<MostPopularFollowerByUser> getMostPopularFollowers(NamedParameterJdbcTemplate jtm) {  

		String sql = "select " + 
				"P.id person_id, P.handle person_handle, P.name person_name, " + 
				"F.id follower_person_id, F.handle follower_person_handle, F.name follower_person_name, " + 
				"NF.NUM_FOLLOWERS popularity " + 
				"from " + 
				"people P, " + 
				"people F, " + 
				"(" + 
				"select RF.person_id, RF.follower_person_id, RF.num_followers " + 
				"from " + 
				"(" + 
				"select RF.person_id, RF.follower_person_id, NF.num_followers " + 
				"from " + 
				"followers RF, " + 
				"(select person_id, count(*) num_followers from followers group by person_id order by person_id) NF " + 
				"where " + 
				"RF.follower_person_id = NF.person_id " + 
				") RF, " + 
				"(" + 
				"select person_id, max(num_followers) max_num_followers " + 
				"from " + 
				"(" + 
				"select RF.person_id, RF.follower_person_id, NF.num_followers " + 
				"from " + 
				"followers RF, " + 
				"(select person_id, count(*) num_followers from followers group by person_id order by person_id) NF " + 
				"where " + 
				"RF.follower_person_id = NF.person_id " + 
				") " + 
				"group by person_id " + 
				") M " + 
				"where " + 
				"RF.person_id = M.person_id " + 
				"and " + 
				"RF.num_followers = M.max_num_followers " + 
				") NF " + 
				"where " + 
				"NF.person_id = P.id " + 
				"and " + 
				"NF.follower_person_id = F.id " + 
				"order by NF.person_id";
		
		//System.out.println(sql);
		//for(MostPopularFollowerByUser x : mostPopularFollowersData) System.out.println(x.toString());

		List<MostPopularFollowerByUser> mostPopularFollowersData = jtm.query(sql, new MostPopularFollowerByUserMapper());
		return mostPopularFollowersData;
	}
	
	
	
}
