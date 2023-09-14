package com.swagger.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "User Service")
public class UserController {

    @GetMapping("/getUser")
    public String getUser() {
        System.out.println("Inside getUser");
        return "Test";
    }
}
