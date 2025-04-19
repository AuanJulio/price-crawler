package com.auanjulio.price_crawler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auanjulio.price_crawler.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	
}
