package com.cloud.login.cloudlogindemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cloud.login.cloudlogindemo.domain.Orders;

@RestController
public class LoginRestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
    @GetMapping("/all")
    public ResponseEntity<Orders> getAllOrders() {
    	Orders orders = restTemplate.getForObject("http://localhost:8099/all", Orders.class);
    	return new ResponseEntity<Orders>(orders, HttpStatus.OK);
    }
    
    @GetMapping("/customer/{id}")
	public ResponseEntity<Orders> getCustomerOrders(@PathVariable Long id){
    	Orders orders = restTemplate.getForObject("http://localhost:8099/customer/" + id, Orders.class);
		return new ResponseEntity<Orders>(orders, HttpStatus.OK);
	}}
