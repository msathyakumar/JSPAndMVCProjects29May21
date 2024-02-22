package com.curdoperations.service;

import java.sql.ResultSet;


import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.curdoperations.bean.Customer;


public class CustomerServiceImpl implements CustomerService {
	private JdbcTemplate jt = null;
	
	public CustomerServiceImpl()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/javasql?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        jt = new JdbcTemplate(dataSource);
	}
	
	public String AddCustomer(Customer c) {
		// TODO Auto-generated method stub
		String status = "";
		String inscmd = "Insert into Customer values(?,?,?,?,?,?,?)";
		int r = jt.update(inscmd, new Object[] {c.getCustid(), c.getCustname(), c.getCaddress(), c.getLocation(), c.getPhone(), c.getEmail(),c.getPwd()});
		
		if(r!=0)
			status = "success";
		else
			status = "fail";
		return status;
	}
	
	public List<Customer> ShowAllCustomers() {
		// TODO Auto-generated method stub
		return jt.query("select * from Customer", new RowMapper<Customer>(){    
	        public Customer mapRow(ResultSet rs, int row) throws SQLException {    
	            Customer c=new Customer();
	            c.setCustid(rs.getString("custid"));
	            c.setCustname(rs.getString("custname"));
	            c.setCaddress(rs.getString("caddress"));
	            c.setLocation(rs.getString("location"));
	            c.setPhone(rs.getString("phone"));
	            c.setEmail(rs.getString("email"));
	            c.setPwd(rs.getString("pwd"));
	            return c;    
	        }  
		});
	}
	
	public String DeleteCustomer(String cid)
	{
		String delcmd = "Delete from Customer where custid=?";
		String status = "";
		int r = jt.update(delcmd, new Object[] {cid});
		if(r!=0)
			status ="success";
		else
			status="fail";
		return status;
	}

	public Customer UserCheck(String email, String pwd)
	{
		String userchk = "Select * from customer where email=? and pwd=?";
		return jt.queryForObject(userchk, new Object[]{email, pwd}, new BeanPropertyRowMapper<Customer>(Customer.class));
	}
}
