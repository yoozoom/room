package com.room.nova.demo.controller.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.room.nova.demo.biz.user.UserService;
import com.room.nova.demo.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser() {
        return userService.getUser();
    }

    @SuppressWarnings("unused")
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
    
    @RequestMapping("/userList")
    public String userList(@RequestParam String id, User user) {
        if (user == null) {
            user = new User();
        }
        if ("1".equals(id)) {
            user.setTitle("cto!");
            user.setUsername("moderich");
        } else {
            user.setTitle("cco!");
            user.setUsername("messi");
        }
        return "user/userList";
    }
}
