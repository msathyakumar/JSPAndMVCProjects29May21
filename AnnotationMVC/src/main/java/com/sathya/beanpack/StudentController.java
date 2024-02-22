package com.sathya.beanpack;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sathya.Students.Student;

@Controller
public class StudentController {
	
	@RequestMapping("student")
	public String studentreg(@ModelAttribute("std") Student std) {
		return "studentsview/studentlogin";
	}
	@RequestMapping("studentprocess")
	public String studentProcessRequest(@ModelAttribute("std") Student std,ModelMap modelmap) {
		modelmap.addAttribute("studentvalue", std);
		System.out.println(std);
		return "studentsview/studentprocesspage";
	}
	
}
