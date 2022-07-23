package com.sportshoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportshoes.models.User;
import com.sportshoes.repositories.UserRepo;

@RestController
public class UserController {
    @Autowired
    UserRepo repo;

    @PostMapping("user/signup")
    public User register(User user)
    {
        repo.save(user);
        return user;

    }
}
