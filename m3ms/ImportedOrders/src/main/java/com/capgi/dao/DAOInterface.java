package com.capgi.dao;

import java.util.List;



import com.capgi.bean.Order;


public interface DAOInterface {

	Order addOrders(Order order);

	List<Order> getAllOrders();

	Order updateOrder(Order order);

	List<Order> findByQuantity(int quantity1, int quantity2);

	List<Order> greaterByAmount(double amount);

}
