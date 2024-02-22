package com.spring.beanpack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParmController {
	
	@RequestMapping("annotate")
	public ModelAndView mymap(@RequestParam(value="id",required = false,defaultValue = "111")int id,@RequestParam(value="name",required = false,defaultValue="sathya")String name) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("id\t"+id);
		System.out.println("name \t"+name);
		modelAndView.setViewName("hello");
		return modelAndView;
		
	}

}
