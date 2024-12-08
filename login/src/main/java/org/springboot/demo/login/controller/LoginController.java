package org.springboot.demo.login.controller;

import org.springboot.demo.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
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