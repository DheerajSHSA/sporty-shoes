package com.sportshoes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
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
