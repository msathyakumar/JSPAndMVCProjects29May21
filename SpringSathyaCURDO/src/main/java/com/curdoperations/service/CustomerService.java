package com.curdoperations.service;
import com.curdoperations.bean.*;
import java.util.*;
public interface CustomerService {
	public String AddCustomer(Customer c);
	public List<Customer> ShowAllCustomers();	
	public String DeleteCustomer(String cid);
	public Customer UserCheck(String email, String pwd);
	
}
