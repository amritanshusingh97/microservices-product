package com.microservicespractice.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicespractice.productservice.entity.Product;
import com.microservicespractice.productservice.services.ProductService;

@RestController
@RequestMapping(path = "product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/")
	public List<Product> getProducts(){
		return productService.getAllProduct();
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getProductById(@PathVariable("id") Integer pId){
		System.out.println("in controller");
		return productService.getProductById(pId);
	}
	
	@PostMapping(path = "/")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("/test")
	public String getTest(){
		return "Cointroller working";
	}
	
}
