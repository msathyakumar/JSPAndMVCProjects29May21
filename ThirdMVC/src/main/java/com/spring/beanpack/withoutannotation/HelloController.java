package com.spring.beanpack.withoutannotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{
	
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception{
		ModelAndView mv1 = new ModelAndView("Hello");
		mv1.addObject("msg", "Priya Bhavani");
		return mv1;
	}

}
