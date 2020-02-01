package com.secondhand;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.secondhand")
public class SecondhandApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondhandApplication.class, args);
    }

}
