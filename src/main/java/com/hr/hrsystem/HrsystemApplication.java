package com.hr.hrsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hr.hrsystem.mapper")
public class HrsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrsystemApplication.class, args);
    }

}
