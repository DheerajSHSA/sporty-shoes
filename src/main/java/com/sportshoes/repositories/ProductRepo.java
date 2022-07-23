package com.sportshoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.models.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
