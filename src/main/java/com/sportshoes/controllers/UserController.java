package com.sportshoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sportshoes.models.Product;
import com.sportshoes.models.Purchase;
import com.sportshoes.models.User;
import com.sportshoes.repositories.PurchaseRepo;
import com.sportshoes.repositories.UserRepo;

@RestController
public class UserController {
    @Autowired
    UserRepo repo;

    @Autowired
    PurchaseRepo pcrepo;

    @PostMapping("user/signup")
    public User register(User user)
    {
        repo.save(user);
        return user;
    }

    @PostMapping("user/purchase")
    public Purchase buy(@RequestParam("uid") int uid, @RequestParam("pid") int pid, Purchase purchase)
    {
        User user = new User();
        Product product = new Product();
        user.setId(uid);
        product.setId(pid);
        purchase.setUser(user);
        purchase.setProduct(product);
        pcrepo.save(purchase);
        return purchase;
    }
}
