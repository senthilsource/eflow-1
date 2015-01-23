
/**
 * 
 */
package com.registerlogin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.registerlogin.model.LoginForm;
import com.registerlogin.model.User;
import com.registerlogin.service.IUserService;

/**
 * @author srivani
 *
 */
@Controller
@RequestMapping(value="/logout")
public class LogoutController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("logout");
		userService.updateLastLogout((String)request.getSession().getAttribute("userName"));
		request.getSession().invalidate();
		return mv;
	}
	
}
