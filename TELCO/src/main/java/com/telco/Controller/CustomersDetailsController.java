package com.telco.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telco.Services.CustomerDetailsService;
import com.telco.Services.CustomersDetailsServiceImpl;
import com.telco.model.CustomersDetails;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class CustomersDetailsController {

	@Autowired
	CustomersDetailsServiceImpl repository;

	@GetMapping("/customersDetails")
	public List<CustomersDetails> getAllCustomersDetails() {
		System.out.println("Get all Customers...");

		List<CustomersDetails> customers = new ArrayList<>();
		repository.findAll().forEach(customers::add);

		return customers;
	}

}