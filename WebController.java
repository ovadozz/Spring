package com.codesample.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codesample.project.repository.DrinksRepository;
import com.codesample.project.repository.MenuaddsRepository;
import com.codesample.project.repository.ProductRepository;

@Controller
public class WebController {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	DrinksRepository drinksRepository;
	@Autowired
	private MenuaddsRepository menuAddsRepository;

		
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/order")
	public String order(Model model) {
		model.addAttribute("order",productRepository.findAll());
		model.addAttribute("drinks",drinksRepository.findAll());
		model.addAttribute("adds",menuAddsRepository.findAll());
		return "order";
	}
	
}
