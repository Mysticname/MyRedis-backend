package com.myredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.myredis.mapper")
@SpringBootApplication
public class myredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(myredisApplication.class, args);
    }

}
