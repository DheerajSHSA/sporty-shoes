package com.sportshoes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.models.PurchaseReport;

public interface PurchaseRepo extends JpaRepository<PurchaseReport,Integer>{

    List<PurchaseReport> findAllByDateofpurchase(String date);
    
}
