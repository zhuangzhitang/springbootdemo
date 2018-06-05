package com.tanggoooo.controller;

import com.tanggoooo.model.ResultData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public Object hello(){
        return new ResultData("123","123d",true);
    }
}
