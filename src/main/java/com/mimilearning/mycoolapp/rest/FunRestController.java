package com.mimilearning.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" endpoint that return "Hello world"
    @GetMapping("/")
    public  String sayHello(){
        return "Hello mimi!";
    }
}
