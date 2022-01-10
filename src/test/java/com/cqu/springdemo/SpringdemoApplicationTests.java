package com.cqu.springdemo;

import com.cqu.springdemo.pojo.Dog;
import com.cqu.springdemo.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootTest
class SpringdemoApplicationTests {
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        System.out.println(dataSource.getClass());
        try {
            Connection connection= dataSource.getConnection();
            System.out.println(connection);
            ResultSet resultSet;
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}