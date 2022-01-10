package com.cqu.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCcontroller {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping("/USERLIST")
    public List<Map<String,Object>> userlist(){
        String SQL="select * from websites";
        List<Map<String,Object>> mps=jdbcTemplate.queryForList(SQL);
        return  mps;
    }

    @GetMapping("/DELEUSER")
    public String DELETUSER(){
        String sql="delete from websites where id= 1";
        jdbcTemplate.execute(sql);
        return "ok";
    }
    @GetMapping("INSERT")
    public String insert(){
        String SQL="insert into websites values (1,'beibei','www.beibei.com',12,'USA')";
        jdbcTemplate.update(SQL);
        return "ok";
    }
}
