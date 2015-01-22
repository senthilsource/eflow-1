/**
 * 
 */
package com.registerlogin.controller;



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
@RequestMapping(value="/login.do")
public class LoginController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView displayLoginForm(){
		ModelAndView mv = new ModelAndView();
		LoginForm loginForm = new LoginForm();
		mv.addObject("form", loginForm);
		mv.setViewName("login");
		return mv;
		
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute("form") LoginForm loginForm){
		System.out.println("in controller");
		ModelAndView mv = new ModelAndView();
		
		boolean flag= userService.validateUser(loginForm.getUserName(), loginForm.getPassword());
		
		if(!flag){
			mv.setViewName("login");
			mv.addObject("message", "Invalid Credentials");
			return mv;
		} else	{
			User user = new User();
			user.setUserName(loginForm.getUserName());
			user.setPassword(loginForm.getPassword());
			userService.updateUserLastLogin(user);
			mv.setViewName("loginSuccess");
			return mv;
		}
		
	}

}
