package com.wescodes.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @GetMapping("/api")
    public String GetApi() {
        return "Hello WesCodes World!";
    }
}
