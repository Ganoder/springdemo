package com.cqu.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class registercontroller {
    @RequestMapping("/register")
    public String register(){
        return "registration";
    }
}
