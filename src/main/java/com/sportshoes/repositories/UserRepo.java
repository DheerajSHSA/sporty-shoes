package com.sportshoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.models.User;

public interface UserRepo extends JpaRepository<User, Integer>{
    
}
