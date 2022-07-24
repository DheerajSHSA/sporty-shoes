package com.sportshoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sportshoes.models.PurchaseReport;
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

    @PostMapping("user/{userid}/buy/{productid}")
    public String buy( @RequestParam("userid") int userid , @RequestParam("productid") int productid )
    {   
        PurchaseReport purchaseReport = new PurchaseReport();
        purchaseReport.setUserid(userid);
        purchaseReport.setProductid(productid);
        purchaseReport.setDateofpurchase(java.time.LocalDate.now().toString());
        pcrepo.save(purchaseReport);
        return purchaseReport.toString();
    }
}
