package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
}