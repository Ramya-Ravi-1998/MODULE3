package com.capg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.capg.entities.Movie;

import java.util.List;

@RepositoryRestResource
public interface MovieRepository extends JpaRepository<Movie,Integer>{

	Movie findByTitle(String title);
	List<Movie> findAllByTitle(String title);
}
