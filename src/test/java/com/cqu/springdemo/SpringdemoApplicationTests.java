package com.cqu.springdemo;

import com.cqu.springdemo.pojo.Dog;
import com.cqu.springdemo.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringdemoApplicationTests {
 @Autowired
    private Dog dog;
 @Autowired
 private Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
