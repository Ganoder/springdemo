package com.cqu.springdemo.filter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginfilter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

Object loginuser=request.getSession().getAttribute("loginuser");
if(loginuser==null){
request.setAttribute("msg","无权限");
request.getRequestDispatcher("/login").forward(request,response);
        return false;
    }else {return true;}
    }


}
