package com.sathya.beanpack;

import java.io.IOError;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginPageController implements Controller{
	
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

}
