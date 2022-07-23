package com.sportshoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sportshoes.repositories.UserRepo;

@Controller
public class MainController {
    @Autowired
    UserRepo repo;

    @RequestMapping("/")
    @ResponseBody
    public String home()
    {
        return "Hello World";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String admin()
    {
        return " Welcome to Sporty Shoes, Admin ";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user()
    {
        return " Welcome to Sporty Shoes, Purchaser ";
    }
    
}
