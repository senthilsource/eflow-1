/**
 * 
 */
package com.registerlogin.dao;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.registerlogin.model.User;

/**
 * @author srivani
 *
 */
	
public class UserHibernateDaoImpl implements IUserDao {
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean isValid(String userName, String password) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unchecked")
		List<User> users = this.sessionFactory.getCurrentSession()
			.createQuery("from  User u where u.userName = ? and u.password = ?")
			.setParameter(0, userName)
			.setParameter(1, password)
			.list();
		
		return users.isEmpty();
	}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateUserLastLogin(User user) {
		// TODO Auto-generated method stub
		
	}
	
	

}
