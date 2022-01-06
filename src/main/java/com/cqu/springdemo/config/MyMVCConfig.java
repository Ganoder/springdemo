package com.cqu.springdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

    @Override
    //这是用来控制视图的，讲白点就是将/changyao请求转移到test
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/changyao").setViewName("test");

    }
}
