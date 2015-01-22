/**
 * 
 */
package com.registerlogin.service;

import com.registerlogin.model.User;

/**
 * @author srivani
 *
 */
public interface IUserService {
	
	public boolean validateUser(String userName, String password);
	public boolean saveUser(User user);
	public void updateUserLastLogin(User user);

}
