package com.cqu.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class logincontroller {
    @RequestMapping("/login")
    public String test(){
        return "login";
    }
}
