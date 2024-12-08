package org.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//springboot的启动注解
@SpringBootApplication
public class BootServer {
    public static void main(String[] args) {
        //启动
        SpringApplication.run(BootServer.class);
    }
}
