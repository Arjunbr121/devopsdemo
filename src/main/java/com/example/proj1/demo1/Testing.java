package com.example.proj1.demo1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {

    @GetMapping("demo")
    public String demo(){
        return "hello this is deployed...";
    }
}
