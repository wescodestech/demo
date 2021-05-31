package com.wescodes.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @GetMapping("/{num1}/{num2}")
    public Sum getSum(@PathVariable("num1") int num1,
                      @PathVariable("num2") int num2){
        return new Sum(num1 + num2);
    }

    @GetMapping("/api")
    public String GetApi() {
        return "Hello WesCodes World!";
    }
}
