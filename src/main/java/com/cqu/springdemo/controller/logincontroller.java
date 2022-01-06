package com.cqu.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class logincontroller {
    @RequestMapping("/login2")
    public String test(){

        return "login";
    }
    @RequestMapping("/doc")
    public String DOC(){
        return "/demo/docs";
    }
    @RequestMapping("/login")
    public String LOGIN(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
        if (username.equals("159")&&password.equals("753")){
            session.setAttribute("loginuser",username);

            return "main_teacher";}else if(username.equals("123")&&password.equals("123"))
            {
                session.setAttribute("loginuser",username);
                return  "main_student";
        }

       model.addAttribute("msg","密码输入错误，请再次输入");

        return "login";
    }

}
