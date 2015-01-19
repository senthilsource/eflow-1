/**
 * 
 */
package com.registerlogin.dao;

import com.registerlogin.model.User;

/**
 * @author srivani
 *
 */
public interface IUserDao {

	public boolean isValid(String userName, String password);
	public boolean saveUser(User user);
}
