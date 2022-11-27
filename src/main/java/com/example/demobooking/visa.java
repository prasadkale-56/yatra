package com.example.demobooking;

import org.springframework.web.bind.annotation.GetMapping;

public class visa {
    @GetMapping("/myVisa")
    public String getData(){
        return "Please checkout visa details";
    }
}
