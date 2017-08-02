package messenger.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import messenger.bean.Message;
import messenger.bean.Person;

public class PersonMapper implements RowMapper{
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException{
		Person person = new Person();
		person.setId(rs.getInt("id"));
		person.setHandle(rs.getString("handle"));
		person.setName(rs.getString("name"));
		return person;
	}
}
