package com.capgi.service;

import java.util.List;

import com.capgi.bean.Order;

public interface OrderServiceInterface {

	Order addOrder(Order order);

	List<Order> getAllOrder();

	Order updateOrder(Order order);

	List<Order> findByQuantity(int quantity1, int quantity2);

	List<Order> greaterByAmount(double amount);



}
