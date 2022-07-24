package com.sportshoes.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sportshoes.models.Product;
import com.sportshoes.models.PurchaseReport;
import com.sportshoes.models.User;
import com.sportshoes.repositories.ProductRepo;
import com.sportshoes.repositories.PurchaseRepo;
import com.sportshoes.repositories.UserRepo;

@RestController
public class AdminController {

    @Autowired
    UserRepo repo;

    @Autowired
    ProductRepo prepo;

    @Autowired
    PurchaseRepo pcrepo;

    @GetMapping("/admin/user/{userid}")
    public Optional<User> getUserById(@RequestParam("userid") int id)
    { 
        return repo.findById(id);
    }

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

    @GetMapping("/admin/products")
    public List<Product> showProducts() {
        return prepo.findAll();
    }

    @GetMapping("/admin/getProductsByCategory")
    public List<Product> getProductsByCategory(@RequestParam String category)
    {
        return prepo.findAllByCategory(category);
    }

    @GetMapping("/admin/purchasereport")
    public List<PurchaseReport> getPurchaseReport()
    {
        return pcrepo.findAll();
    }

    @GetMapping("/admin/purchasereportbydate/{date}")
    public List<PurchaseReport> getPurchaseReportByDate(@RequestParam("date") String date)
    {
        return pcrepo.findAllByDateofpurchase(date);
    }
}
