package com.example.fiirstSecurityApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/say")
public class HelloController {


    @GetMapping("/hello")
    public String sayHello()
    {
    return "Spring security in action";
    }
}
