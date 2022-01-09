package com.cqu.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addresultcontroller {
    @RequestMapping("/addresult")
    public String addresult(String departmentno){

        return "index";
    }
}
