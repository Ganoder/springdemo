package com.cqu.springdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//这样写了就不用再getset了。
public class Department {
    private String department_name;
    private Integer id;
}
