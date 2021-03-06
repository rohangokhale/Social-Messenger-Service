package messenger.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import messenger.bean.Message;

public class MessageMapper implements RowMapper{
	public Message mapRow(ResultSet rs, int rowNum) throws SQLException{
		Message message = new Message();
		message.setId(rs.getInt("id"));
		message.setPersonId(rs.getInt("person_id"));
		message.setContent(rs.getString("content"));
		return message;
	}
}
