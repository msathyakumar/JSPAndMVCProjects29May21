package com.sathya.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.springmvc.beans.Student;

@Controller
public class FirstController {
	
	@RequestMapping("home")
	public ModelAndView myHome() {
		ModelAndView mov = new ModelAndView();
		mov.addObject("name","sathya");
		mov.setViewName("home");
		return mov;
	}
	
	@RequestMapping("loginpage")
	public String myLogin() {
		return "login";
	}
	
	@RequestMapping("studentdetials")
	public String myStudent() {
		
		return "students";
	}
	
	
	@RequestMapping(value="studentdetialsview",method = RequestMethod.POST)
	public String myStudents(@ModelAttribute("student") Student stud,ModelMap modelmap) {
		modelmap.addAttribute("stud",stud);
		
		System.out.println(stud);
		return "studentres";
	}

}
