package com.codesample.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesample.project.data.Drinks;

@Repository
public interface DrinksRepository  extends JpaRepository<Drinks, String>{

}
