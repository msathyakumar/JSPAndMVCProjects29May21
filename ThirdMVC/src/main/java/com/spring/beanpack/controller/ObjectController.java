package com.spring.beanpack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.beanpack.emp.Employee;

@Controller
public class ObjectController {
	@RequestMapping("objmapper")
	public ModelAndView mymodelview() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("objmapper");
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("keersat");
		emp.setSal("10000");
		modelandview.addObject("employee",emp);
		return modelandview;
	}
	

}
