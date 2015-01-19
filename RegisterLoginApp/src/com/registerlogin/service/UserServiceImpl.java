/**
 * 
 */
package com.registerlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registerlogin.dao.IUserDao;
import com.registerlogin.model.User;

/**
 * @author srivani
 **/
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;

	@Override
	public boolean validateUser(String userName, String password) {
		System.out.println("in service");
		// TODO Auto-generated method stub
		boolean flag=userDao.isValid(userName, password);
		return flag;
	}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("in userservice");
		boolean flag =userDao.saveUser(user);
		return flag;
		
	}
	

}
