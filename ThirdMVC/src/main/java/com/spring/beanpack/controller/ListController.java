package com.spring.beanpack.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.beanpack.emp.Employee;

@Controller
public class ListController {
	@RequestMapping("displaylist")
	public ModelAndView mymodelview() {
		List<Employee> employee = new ArrayList<>();
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("displaylist");
		Employee emp1 = new Employee();
		emp1.setId(10);
		emp1.setName("keersat");
		emp1.setSal("10000");
		
		Employee emp2 = new Employee();
		emp2.setId(110);
		emp2.setName("sathya");
		emp2.setSal("1000012");
		
		Employee emp3 = new Employee();
		emp3.setId(222);
		emp3.setName("kumar");
		emp3.setSal("1000014");
		
		employee.add(emp3);
		employee.add(emp2);
		employee.add(emp1);
		
		modelandview.addObject("employee",employee);
		return modelandview;
	}
	

}
