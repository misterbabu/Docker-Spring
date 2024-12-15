package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeDemo {
    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to Jocata -----";
    }
}
