package com.sportshoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.models.Purchase;

public interface PurchaseRepo extends JpaRepository<Purchase, Integer>{
    
}
