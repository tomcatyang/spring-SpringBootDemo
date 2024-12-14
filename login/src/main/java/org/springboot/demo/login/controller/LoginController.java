package org.springboot.demo.login.controller;

import org.springboot.demo.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springboot.demo.client.GrpcClientService;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @Autowired
    private GrpcClientService grpcClientService;


    @RequestMapping("/test")
    @ResponseBody
    public String testDemo() {
        return "Hello World!";
    }

    @RequestMapping("/testGrpc")
    @ResponseBody
    public String testGrpc() {
        return grpcClientService.sendMessage("test");
    }

    @RequestMapping("/getAllUsers")
    @ResponseBody
    public String getAllUsers() {
        return userService.getAllUsers().toString();
    }

}