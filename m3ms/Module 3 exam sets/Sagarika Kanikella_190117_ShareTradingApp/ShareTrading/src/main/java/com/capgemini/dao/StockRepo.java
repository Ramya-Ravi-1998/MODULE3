package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Stock;

@Repository
public interface StockRepo extends JpaRepository<Stock, Integer> {

}
