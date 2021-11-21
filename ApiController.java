package com.codesample.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.codesample.project.data.Drinks;
import com.codesample.project.data.Menuadds;
import com.codesample.project.data.Product;

import com.codesample.project.repository.DrinksRepository;
import com.codesample.project.repository.MenuaddsRepository;
import com.codesample.project.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private DrinksRepository drinksRepository;
	@Autowired
	private MenuaddsRepository menuAddsRepository;

	
	@GetMapping("/order")
	public List<Drinks> getDrinks(){
		return drinksRepository.findAll();
	}
	public List<Product> getProduct(){		
		return productRepository.findAll();
	}
	public List<Menuadds> getMenuadds(){
		return menuAddsRepository.findAll();
	}

	
}
