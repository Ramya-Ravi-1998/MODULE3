package com.capgemini.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.Stock;
import com.capgemini.exception.StockException;

@Repository
public interface IStockDAO {

	public List<Stock> createStock(Stock stock) throws StockException;

	public Stock updateStock(Stock stock) throws StockException;

	public void deleteStockById(int id) throws StockException;

	public List<Stock> viewAll() throws StockException;

	public Stock findStockById(int id) throws StockException;

	Stock calculateOrder(Stock bean);

}
