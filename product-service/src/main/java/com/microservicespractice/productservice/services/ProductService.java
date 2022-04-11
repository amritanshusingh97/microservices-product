package com.microservicespractice.productservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicespractice.productservice.entity.Product;
import com.microservicespractice.productservice.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;
	
	public List<Product> getAllProduct(){
		return productRepo.findAll();
	}
	
	public Optional<Product> getProductById(Integer pId) {
		return productRepo.findById(pId);
	}
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	
	
}
