package com.room.nova.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
    
    @RequestMapping("/hello")
    public String hello2() {
        System.out.println("action hello...");
        return "hello";
    }
}
