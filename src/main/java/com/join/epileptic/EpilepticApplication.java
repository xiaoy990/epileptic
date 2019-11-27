package com.join.epileptic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.join.epileptic.mapper")
@SpringBootApplication
public class EpilepticApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpilepticApplication.class, args);
    }

}
