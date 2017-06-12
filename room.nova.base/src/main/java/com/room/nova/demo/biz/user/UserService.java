package com.room.nova.demo.biz.user;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.room.nova.demo.vo.Human;
import com.room.nova.demo.vo.User;
import com.room.nova.util.SpringUtils;

@Service
public class UserService {
    
    @Value("${user.title}")
    private String title;
    
    @Resource
    private SpringUtils springUtils;

    @SuppressWarnings("static-access")
    public User getUser() {
        System.out.println("--- use service ---");
//        User u = new User();
//        u.setId(1L);
//        u.setUsername(title + " kaka");
        User u = (User) springUtils.getBean("genOneUser");
        Human h = (Human) springUtils.getBean("genOneHuman");
        System.out.println(h.getName());
        Human h2 = (Human) springUtils.getBean("aersa");
        System.out.println(h2.getName());
        return u;
    }
}
