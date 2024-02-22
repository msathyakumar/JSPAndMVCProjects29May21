package com.sathya.beanpack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginViewController {
	
	@RequestMapping("/")
	public String firstPage() {
		return "index";
	}
	@RequestMapping("/home")
	public String Second() {
		return "home";
	}
	@RequestMapping("/aboutus")
	public String third() {
		return "about";
	}
	@RequestMapping("/contactus")
	public String fourth() {
		return "contact";
	}
	@RequestMapping("/login")
	public String loginPage() {
		
		return "login";
		
	}
	@RequestMapping(value="/loginprocess",method=RequestMethod.POST)
	public ModelAndView loginProcess(@RequestParam("user") String uname, @RequestParam("password") String pwd, ModelMap map) throws Exception
	{
		ModelAndView mv = null;    	
		if(uname.equals("sathya") && pwd.equals("sathya"))
			mv = new ModelAndView("home");
		else
		{
			 	mv = new ModelAndView("login");
			    mv.addObject("msg", "Username or Password is wrong!!");
		}
		return mv;
	}

}
