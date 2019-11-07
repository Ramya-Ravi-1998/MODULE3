package com.capgi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capgi.bean.Order;
import com.capgi.service.OrderServiceInterface;





@RestController
public class OrderController {
       
	@Autowired
	OrderServiceInterface service;
	
	   // Add Order Details
	   @PostMapping(path="/ordere",consumes="application/json")
	   public Order addOrder(@RequestBody Order order) {
		 return service.addOrder(order);
	  }
	
	
	   // Getting All Orders Detail  
		@GetMapping(path="/orders")
		public List<Order> getAllOrder() {
			
			return service.getAllOrder();
		}
		
		//Update Order Details
		 @PutMapping(path="/order",consumes="application/json")
		 public Order updateOrder(@RequestBody Order order) {
			 return service.updateOrder(order);
		 }
		 
		//Getting Orders by Quantity Range 
		 @RequestMapping("/getOredersByrange/{quantity}/{quantity}")
			List<Order> getByQuantity(@PathVariable int quantity1, @PathVariable int quantity2) {
				return service.findByQuantity(quantity1, quantity2);
			}
       
		 @RequestMapping("/greaterBy/{amount}")
			List<Order> greaterByAmount(@PathVariable double amount){
				return service.greaterByAmount(amount);
			} 
	
}
