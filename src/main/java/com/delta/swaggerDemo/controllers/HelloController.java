package com.delta.swaggerDemo.controllers;

import com.delta.swaggerDemo.models.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Hello控制類")
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/getUser")
    @ApiOperation("hello控制類")
    public User getUser() {
        return new User();
    }
}
