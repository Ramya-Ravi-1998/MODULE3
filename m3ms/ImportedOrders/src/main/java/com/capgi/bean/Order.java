package com.capgi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="orderstable")
public class Order {
	  
	    //@GeneratedValue(strategy = GenerationType.AUTO)
	    
	    @SequenceGenerator(name="seq" , sequenceName = "order_seq")
	    @GeneratedValue(generator = "seq")
	@Id
	private int id;
	private int quantity;
	private double price;
	private double amount;
	private double charges;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", quantity=" + quantity + ", amount=" + amount + ", charges="
				+ charges + "]";
	}
	
	
	
}
