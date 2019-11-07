package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.Stock;
import com.capgemini.exception.StockException;
import com.capgemini.service.StockService;

@RestController
public class StockController {

	@Autowired
	StockService service;

	// creating a stock
	@PostMapping(path = "/stock", consumes = "application/json")
	public List<Stock> createStock(@RequestBody Stock stock) throws StockException {
		return service.createStock(stock);
	}

	// updating a stock
	@PutMapping(path = "/stock", consumes = "application/json")
	public Stock updateStock(@RequestBody Stock product) throws StockException {
		return service.updateStock(product);
	}

	// delete a stock based on id
	@DeleteMapping(path = "/stock/{id}")
	public ResponseEntity<String> deleteStock(@PathVariable Integer id) throws StockException {
		service.deleteStockById(id);
		return new ResponseEntity<String>("stock with the id " + id + " deleted", HttpStatus.OK);
	}

	// view all stocks
	@GetMapping(path = "/stock")
	public List<Stock> viewAll() throws StockException {
		return service.viewAll();
	}

	@GetMapping(path = "/stock/{id}")
	public Stock findStockById(@PathVariable Integer id) throws StockException {
		return service.findStockById(id);
	}

}
