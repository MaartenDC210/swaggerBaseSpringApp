package com.swaggertake6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/sayHello")
    public String SayHello(){
        return "...";
    }
}
