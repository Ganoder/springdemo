package com.cqu.springdemo.controller;

import com.cqu.springdemo.dao.DepartmentDao;
import com.cqu.springdemo.pojo.Department;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class addmancontroller {
    @RequestMapping("/addman")
    public  String ADDman(Model model){
        Collection<Department> getDepartment=DepartmentDao.getDepartment();
        model.addAttribute("departments",getDepartment);
        return "addman";
    }
}
