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
@RequestMapping(value="/welcome.do")
public class WelcomeController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView displayWelcome(){
	ModelAndView mv = new ModelAndView("welcome");
	return mv;
}
}
