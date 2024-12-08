package org.springboot.demo.controller;

import org.springboot.demo.repository.UserRepository;
import org.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    @ResponseBody
    public String testDemo() {

        return "Hello World!";
    }

    @RequestMapping("/getAllUsers")
    @ResponseBody
    public String getAllUsers() {
        return userService.getAllUsers().toString();
    }

}