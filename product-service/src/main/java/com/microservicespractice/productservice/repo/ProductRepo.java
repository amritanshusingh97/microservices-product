package com.microservicespractice.productservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicespractice.productservice.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
