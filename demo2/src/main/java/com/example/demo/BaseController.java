package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public String getMessage1() {

        return "Hello World \n This is Version 3.0.0";

    }

    @GetMapping("/bye")
    public String getMessage2() {

        return "Goodbye \n This is Version 3.0.0";

    }


}
