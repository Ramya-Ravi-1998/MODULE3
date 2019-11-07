package com.capgi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.capgi.bean.Order;
@Repository
public class OrderRepository implements DAOInterface{
    
	@Autowired
	OrderRepositoryInterface repo;
	
	@Override
	public Order addOrders(Order order) {
		
		return repo.save(order);
	}

	public List<Order> getAllOrders() {
		
		return repo.findAll();
	}

	@Override
	public Order updateOrder(Order order) {
		
		return repo.save(order);
	}

	@Override
	public List<Order> findByQuantity(int quantity1, int quantity2) {
		
		return repo.findByRange(quantity1,quantity2);
	}

	@Override
	public List<Order> greaterByAmount(double amount) {
		
		return repo.findBygreater(amount);
	}

}
