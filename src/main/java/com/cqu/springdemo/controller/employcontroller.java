package com.cqu.springdemo.controller;

import com.cqu.springdemo.dao.EmployeeDao;
import com.cqu.springdemo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class employcontroller {

    EmployeeDao employeeDao;

    @RequestMapping("/main_teacher")
    public String test(Model model){
        Collection<Employee> employees=employeeDao.GETALL();

        model.addAttribute("emps",employees);
        System.out.println(employees);
        return "main_teacher";
    }




}
