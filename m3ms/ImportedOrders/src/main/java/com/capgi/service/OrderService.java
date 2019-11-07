package com.capgi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgi.bean.Order;
import com.capgi.dao.DAOInterface;

@Service
public class OrderService implements OrderServiceInterface{
    @Autowired
	DAOInterface dao;
	
	@Override
	public Order addOrder(Order order) {
       double price = order.getPrice()*75;
        order.setPrice(price);
	  double amount = order.getQuantity()*price;
		order.setAmount(amount);
		double charges = amount*(1.25)/100;
		order.setCharges(charges);
		
		
		return dao.addOrders(order);
	}

	@Override
	public List<Order> getAllOrder() {
		
		return dao.getAllOrders();
	}

	@Override
	public Order updateOrder(Order order) {
		
		return dao.updateOrder(order);
	}

	@Override
	public List<Order> findByQuantity(int quantity1, int quantity2) {
		
		return dao.findByQuantity(quantity1, quantity2);
	}

	@Override
	public List<Order> greaterByAmount(double amount) {
		
		return dao.greaterByAmount( amount);
	}

}
