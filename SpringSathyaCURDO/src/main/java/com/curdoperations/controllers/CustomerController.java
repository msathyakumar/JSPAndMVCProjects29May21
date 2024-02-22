package com.curdoperations.controllers;
import com.curdoperations.bean.*;
import com.curdoperations.service.*;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class CustomerController {
	
	CustomerServiceImpl cs = new CustomerServiceImpl();
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String ShowCustomer() {
		return "AddCustomer";
	}
	
	@RequestMapping(value="customerprocess", method=RequestMethod.POST)
	public String customerprocess(HttpServletRequest request, HttpServletResponse response) {
		String cid = request.getParameter("txtCid");
		String cname = request.getParameter("txtCname");
		String adrs = request.getParameter("txtAdrs");
		String loc = request.getParameter("txtLoc");
		String ph = request.getParameter("txtPhone");
		String email = request.getParameter("txtEmail");
		String pass = request.getParameter("txtPass");
		
		Customer c = new Customer();
		c.setCustid(cid);
		c.setCustname(cname);
		c.setCaddress(adrs);
		c.setLocation(loc);
		c.setEmail(email);
		c.setPwd(pass);
		c.setPhone(ph);
		
		String st = cs.AddCustomer(c);
		if(st.equals("success"))
			return "redirect:/view";
		else
			return "redirect:/add";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String ShowLogin() {
		return "LoginPage";
	}
	
	@RequestMapping(value="/cview", method=RequestMethod.GET)
	public String GetCustomer() {
		return "CustomerViewPage";
	}
	
	
	@RequestMapping(value="/errPage", method=RequestMethod.GET)
	public String LoginFail() {
		return "Error";
	}
	
	
	@RequestMapping(value="/delcust/{id}", method=RequestMethod.GET)
	public String delcust(@PathVariable String id) {
		String st = "";
		if(cs.DeleteCustomer(id).equals("success"))
			st="redirect:/view";
		return st;
	}
	
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String ShowAllCustomer(Model m) {
		List<Customer>  custList = cs.ShowAllCustomers();
		m.addAttribute("list",custList);
		return "ViewAllCustomers";
	}
	
	
	@RequestMapping(value="/loginprocess", method=RequestMethod.POST)
	public String loginprocess(@RequestParam("txtUser") String uname, @RequestParam("txtPass") String pwd, ModelMap m) 
	{
		String st = "";
		if(uname.equalsIgnoreCase("Admin") && pwd.equalsIgnoreCase("admin"))
		{
			st = "redirect:/view";			
		}
		else
		{
			try
			{
				Customer c1 = cs.UserCheck(uname, pwd);
				if(c1!=null)
				{					
					System.out.println(c1.getCustname());									
					List<Customer> clist = new ArrayList<Customer>();
					//clist.add(c1);					
					m.addAttribute("cinfo", c1.getCustname());
					//m.addAllAttributes(clist);
					//m.addAttribute("clist", clist);
					st = "redirect:/cview";	
				}				
			}
			catch(Exception ex)
			{
				st = "redirect:/errPage";
				System.out.println("error");
			}
		}		
		return st;		
	}
}
