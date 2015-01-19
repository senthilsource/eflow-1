/**
 * 
 */
package com.registerlogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.registerlogin.model.User;
import com.registerlogin.service.IUserService;

/**
 * @author srivani
 *
 */
@Controller
@RequestMapping(value="/register.do")
public class RegistrationController {
	
	@Autowired
	private IUserService userService;
	ModelAndView mv = new ModelAndView();
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView displayRegister(){
		
		User user = new User();
		mv.addObject("user", user);
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView processRegister(@Valid@ModelAttribute("user") User user){
		System.out.println("user controller");
		System.out.println(user);
		boolean flag = userService.saveUser(user);
		System.out.println("after service");
		if(flag){
		mv.setViewName("registerSuccess");
		return mv;
	}
		else{
			mv.addObject("message", "enter valid  fields");
			mv.setViewName("register");
			return mv;
		}
	}

}
