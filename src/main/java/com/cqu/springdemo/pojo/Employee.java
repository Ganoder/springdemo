package com.cqu.springdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private String EMAIL;
    private Integer sex;//0女
    private Department department;
    private Integer birthday;
}
