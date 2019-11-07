package com.capg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.capg.entities.MovieCategory;

@RestResource
public interface MovieCategoryRepository extends JpaRepository<MovieCategory,Integer>{

}
