package com.capg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="moviecat_tb")
public class MovieCategory {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int mCat;
private String mCatName;

@OneToOne(mappedBy="category")   //onetomany
private Movie movie;             // private List<Movie> movies;

public MovieCategory() {
	super();
	// TODO Auto-generated constructor stub
}



public MovieCategory(String mCatName, Movie movie) {
	super();
	this.mCatName = mCatName;
	this.movie = movie;
}


@Override
public String toString() {
	return "MovieCategory [mCat=" + mCat + ", mCatName=" + mCatName + ", movie=" + movie + "]";
}


public int getmCat() {
	return mCat;
}


public void setmCat(int mCat) {
	this.mCat = mCat;
}


public String getmCatName() {
	return mCatName;
}


public void setmCatName(String mCatName) {
	this.mCatName = mCatName;
}


public Movie getMovie() {
	return movie;
}


public void setMovie(Movie movie) {
	this.movie = movie;
}




}
