package challenge.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import service.bean.MostPopularFollowerByUser;

public class MostPopularFollowerByUserMapper implements RowMapper{
	public MostPopularFollowerByUser mapRow(ResultSet rs, int rowNum) throws SQLException{
		MostPopularFollowerByUser mostPopularFollowerByUser = new MostPopularFollowerByUser();
		mostPopularFollowerByUser.setUserId(rs.getInt("person_id"));
		mostPopularFollowerByUser.setUserHandle(rs.getString("person_handle"));
		mostPopularFollowerByUser.setUserName(rs.getString("person_name"));
		mostPopularFollowerByUser.setFollowerId(rs.getInt("follower_person_id"));
		mostPopularFollowerByUser.setFollowerHandle(rs.getString("follower_person_handle"));
		mostPopularFollowerByUser.setFollowerName(rs.getString("follower_person_name"));
		mostPopularFollowerByUser.setPopularity(rs.getInt("popularity"));
		return mostPopularFollowerByUser;
	}
}
