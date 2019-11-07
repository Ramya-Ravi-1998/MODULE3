package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.StockRepo;
import com.capgemini.entity.Stock;
import com.capgemini.exception.StockException;

@Service
public class StockServiceImp implements StockService {

	@Autowired
	StockRepo repo;

	@Override
	public Stock calculateOrder(Stock bean) {
		// TODO Auto-generated method stub
		int quantity = bean.getQuantity();
		double price = bean.getPrice();
		double amount = price * quantity;
		double result;
		if (quantity > 100) {
			result = (amount * (0.3)) / 100;
		} else {
			result = (amount * (0.5) / 100);
		}
		bean.setAmount(amount);
		bean.setBrokerage(result);
		return bean;
	}

	@Override
	public List<Stock> createStock(Stock stock) throws StockException {
		try {
			stock = calculateOrder(stock);
			repo.save(stock);
			return repo.findAll();
		} catch (Exception e) {
			throw new StockException(e.getMessage());
		}
	}

	@Override
	public void deleteStockById(int id) throws StockException {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(id);
		} catch (Exception e) {
			throw new StockException(e.getMessage());
		}

	}

	@Override
	public List<Stock> viewAll() throws StockException {
		// TODO Auto-generated method stub
		try {
			return repo.findAll();
		} catch (Exception e) {
			throw new StockException(e.getMessage());
		}
	}

	@Override
	public Stock findStockById(int id) throws StockException {
		// TODO Auto-generated method stub
		try {
			return repo.findById(id).get();
		} catch (Exception e) {
			throw new StockException(e.getMessage());
		}
	}

	@Override
	public Stock updateStock(Stock stock) throws StockException {
		try {
			return repo.save(stock);
		} catch (Exception e) {
			throw new StockException(e.getMessage());
		}
	}

}
