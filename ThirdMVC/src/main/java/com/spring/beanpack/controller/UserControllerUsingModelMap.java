package com.spring.beanpack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.beanpack.emp.Users;

@Controller
public class UserControllerUsingModelMap {
	
	@RequestMapping("registerusermm")
	public String registerpages1() {
		return "registerPage";
	}
	@RequestMapping(value="registerusers",method=RequestMethod.POST)
	public String responsepage2(@ModelAttribute("user") Users user,ModelMap modelmap) {
		System.out.println(user);
		modelmap.addAttribute("user",user);
		return "regResult";
		
		
	}

}
