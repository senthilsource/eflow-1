/**
 * 
 */
package com.registerlogin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.registerlogin.model.User;

/**
 * @author srivani
 *
 */

public class UserDaoImpl implements IUserDao{

	@Override
	public boolean isValid(String userName, String password) {
		// TODO Auto-generated method stub
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
		PreparedStatement ps=con.prepareStatement("select * from USER where userName=? and password=?");
		ps.setString(1, userName);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			return false;
		}
				}
		
		catch(Exception e){
			System.out.println(e.getStackTrace());
			
		}
		return true;
		
}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			PreparedStatement ps = con.prepareStatement("insert into user(firstName,lastName,userName,password) values(?,?,?,?)");
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getUserName());
			ps.setString(4, user.getPassword());
			int i=ps.executeUpdate();
			if(i>0){
				return true;
			}
			
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		return false;
	}

	@Override
	public void updateUserLastLogin(User user) {
		// TODO Auto-generated method stub
		
	}
}
