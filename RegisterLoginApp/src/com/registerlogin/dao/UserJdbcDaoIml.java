/**
 * 
 */
package com.registerlogin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.registerlogin.model.User;

/**
 * @author srivani
 *
 */

@Repository
public class UserJdbcDaoIml implements IUserDao {
	
	private JdbcTemplate jdbcTemplate ;

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	@Autowired
	public void setDataSorce(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean isValid(String userName, String password) {
		User user = this.jdbcTemplate.queryForObject("select firstName, lastName from USER where userName = ? and password = ?", 
				new Object[]{userName, password}, new RowMapper<User>() {
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User user = new User();
						user.setFirstName(rs.getString("firstName"));
						user.setLastName(rs.getString("lastName"));
						return user;
					}
				});
		
		return user == null;
	}

	@Override
	public boolean saveUser(User user) {
//		// TODO Auto-generated method stub
		 int i=this.jdbcTemplate.update("insert into user(firstName,lastName,userName,password) values(?,?,?,?)", user.getFirstName(),user.getLastName(),user.getUserName(),user.getPassword());
		return (i>0);
	}
	
	

}
