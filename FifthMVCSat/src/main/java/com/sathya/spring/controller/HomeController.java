package com.sathya.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class HomeController {
	
	
	@RequestMapping("homePage")
	public String homepages() {
		return "homepage";
	}

}
