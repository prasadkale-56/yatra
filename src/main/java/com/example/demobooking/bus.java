package com.example.demobooking;

import org.springframework.web.bind.annotation.GetMapping;

public class bus {
    @GetMapping("/myBus")
    public String getData(){
        return "Please book tickets for NITA TRAVELLES";
    }
}
