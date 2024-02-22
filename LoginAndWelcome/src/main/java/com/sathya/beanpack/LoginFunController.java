package com.sathya.beanpack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginFunController implements Controller{
	
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		String name=request.getParameter("user");
		String pass=request.getParameter("password");
		ModelAndView mav =null;
		if(name.equals("sathya")&&pass.equals("sathya")) {
			
			mav = new ModelAndView();
			mav.setViewName("welcome");
			mav.addObject("user",name);
		}
		else {
			mav=new ModelAndView();
			mav.setViewName("error");
		}
		
		return mav;
	}

}
