package com.spring.beanpack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.beanpack.emp.Users;

@Controller
public class UserController {
	
	@RequestMapping("registeruser")
	public ModelAndView registerpages() {
		ModelAndView mov = new ModelAndView();
		mov.setViewName("registerPage");
		return mov;
	}
	@RequestMapping(value="registeruser",method=RequestMethod.POST)
	public ModelAndView responsepage(@ModelAttribute("user") Users user) {
		System.out.println(user);
		ModelAndView mov = new ModelAndView();
		mov.addObject("user",user);
		mov.setViewName("regResult");
		return mov;
		
		
	}

}
