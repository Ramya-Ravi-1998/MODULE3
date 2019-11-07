package com.capgemini.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Stock;
import com.capgemini.exception.StockException;

@Repository
public abstract class StockDAOImpl implements IStockDAO {

	@Autowired
	StockRepo repo;

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
