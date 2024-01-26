package com.amitu.spring.cloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amitu.spring.cloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
