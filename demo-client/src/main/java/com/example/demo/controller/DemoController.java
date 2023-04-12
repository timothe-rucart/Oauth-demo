package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @GetMapping("api/demo")
    public String demo(@RequestParam(required = false) String name){
        return name == null ?  "hello world" : "hellooo " + name;
    }


}
