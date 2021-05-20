package com.delta.swaggerDemo.controllers;

import com.delta.swaggerDemo.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/getUser")
    public User getUser() {
        return new User();
    }
}
