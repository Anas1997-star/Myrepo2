package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customers.Customer;

@RestController
@RequestMapping("/Customer")
public class ApiController {
	Customer cust;
@GetMapping("{cid}")
	public Customer getCustomerDetails(String cid)
	{
		return cust;   //new Customer("101","shaik","shaik@gmail.com");
	}
@PostMapping
public String createCustomerDetails(@RequestBody Customer cust)
{
	this.cust=cust;
	return "customer created successfully";
}
@PutMapping
public String updateCustomerDetails(@RequestBody Customer cust)
{
	this.cust=cust;
	return "customer updated successfully";
}
@DeleteMapping("{cid}")
public String deleteCustomerDetails(String cid)
{
	this.cust=null;
	return "customer deleted successfully";
}

	
}
