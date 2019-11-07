package com.capgemini.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Stock {

	@Id
	@SequenceGenerator(name = "s1", sequenceName = "stock_sequence")
	@GeneratedValue(generator = "s1")
	private int id;
	private String name;
	private double price;
	private int quantity;
	private double amount;
	private double brokerage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBrokerage() {
		return brokerage;
	}

	public void setBrokerage(double brokerage) {
		this.brokerage = brokerage;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", amount="
				+ amount + ", brokerage=" + brokerage + "]";
	}

}
