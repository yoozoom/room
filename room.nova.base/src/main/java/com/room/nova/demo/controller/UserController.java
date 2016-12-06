package com.room.nova.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.room.nova.demo.vo.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public User getUser() {
        User u = new User();
        u.setId(1L);
        u.setUsername("kaka");
        return u;
    }

    @RequestMapping("/getUserNull")
    public User getUserNull() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            System.out.println("user exception e");
        }
        User u = new User();
        u.setId(1L);
        u.setUsername("kaka");
        return u;
    }
}
