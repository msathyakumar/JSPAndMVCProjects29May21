package com.spring.beanpack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id",123);
		modelAndView.addObject("name","sathya");
		modelAndView.addObject("sal",10000);
		modelAndView.addObject("msg1","this is the dummy text");
		modelAndView.addObject("msg", "Priya Bhavani");
		return modelAndView;
	}
	}
