package org.springboot.demo.api.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//springboot的启动注解
@SpringBootApplication
public class GrpcServer {
    public static void main(String[] args) {
        //启动
        SpringApplication.run(GrpcServer.class);
    }
}
