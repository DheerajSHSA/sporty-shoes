package com.sportshoes.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportshoes.models.Product;
import com.sportshoes.models.User;
import com.sportshoes.repositories.ProductRepo;
import com.sportshoes.repositories.UserRepo;

@RestController
public class AdminController {

    @Autowired
    UserRepo repo;

    @Autowired
    ProductRepo prepo;

    @GetMapping("/admin/users")
    public List<User> getUsers() {
        List<User> users = repo.findAll();
        return users;
    }

    @PostMapping("/admin/product")
    public Product addProduct(Product product) {
        prepo.save(product);
        return product;
    }

}
