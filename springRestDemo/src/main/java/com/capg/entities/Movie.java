package com.capg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;


	@Entity
	@Table(name="ramya_movie")
	
	
	public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int movieId;
	private String title;
	private String descr;
	private int dailyRent;
	private int stockInHead;
	
	@OneToOne
	@JoinColumn(name="mcat")
	@RestResource(path= "movieCategories", rel="mcat")
	private MovieCategory category;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, String descr, int dailyRent, int stockInHead, MovieCategory category) {
		super();
		this.title = title;
		this.descr = descr;
		this.dailyRent = dailyRent;
		this.stockInHead = stockInHead;
		this.category = category;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public int getDailyRent() {
		return dailyRent;
	}

	public void setDailyRent(int dailyRent) {
		this.dailyRent = dailyRent;
	}

	public int getStockInHead() {
		return stockInHead;
	}

	public void setStockInHead(int stockInHead) {
		this.stockInHead = stockInHead;
	}

	public MovieCategory getCategory() {
		return category;
	}

	public void setCategory(MovieCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", descr=" + descr + ", dailyRent=" + dailyRent
				+ ", stockInHead=" + stockInHead + ", category=" + category + "]";
	}
	
	}