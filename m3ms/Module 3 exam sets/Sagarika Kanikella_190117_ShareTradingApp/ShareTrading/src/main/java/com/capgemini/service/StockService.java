package com.capgemini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.entity.Stock;
import com.capgemini.exception.StockException;

@Service
public interface StockService {

	public Stock calculateOrder(Stock bean);

	public List<Stock> createStock(Stock stock) throws StockException;

	public Stock updateStock(Stock stock) throws StockException;

	public void deleteStockById(int id) throws StockException;

	public List<Stock> viewAll() throws StockException;

	public Stock findStockById(int id) throws StockException;

}
