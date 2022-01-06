package com.cqu.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
public class indexcontroller {
    @RequestMapping("/index")
    public String test(){
          return "index";
    }
}
