package com.capgi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgi.bean.Order;



@Repository
public interface OrderRepositoryInterface extends JpaRepository<Order, Integer>{

	@Query("from Order order where order.quantity between :quantity1 and :quantity2")
	List<Order> findByRange(@Param("quantity1") int quantity1, @Param("quantity2") int quantity2);

	@Query("from Order order where order.amount > :amount")
	List<Order> findBygreater(@Param("amount") double amount);
	
}
