package com.sportshoes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportshoes.models.User;
import com.sportshoes.repositories.UserRepo;

@RestController
public class AdminController {

    @Autowired
    UserRepo repo;

    @GetMapping("/admin/users")
    public List<User> getUsers()
    {
        List<User> users = repo.findAll();
        return users;
    }
}
