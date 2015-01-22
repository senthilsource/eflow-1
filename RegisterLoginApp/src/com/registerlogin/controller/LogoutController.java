/**
 * 
 */
package com.registerlogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author srivani
 *
 */
@Controller
@RequestMapping(value="/logout")
public class LogoutController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView logout(){
		ModelAndView mv = new ModelAndView("logout");
		return mv;
	}
	
}
