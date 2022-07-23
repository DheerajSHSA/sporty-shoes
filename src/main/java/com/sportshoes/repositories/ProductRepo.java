package com.sportshoes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.models.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findAllByCategory(String category);

    
}
