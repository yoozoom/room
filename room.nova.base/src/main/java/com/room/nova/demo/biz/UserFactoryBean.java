
package com.room.nova.demo.biz;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.room.nova.demo.vo.Human;
import com.room.nova.demo.vo.User;

@Component
public class UserFactoryBean {

    @Bean
    public User genOneUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("bean factory gen");
        user.setTitle("gen to human");
        return user;
    }
    
    @Bean
    public Human genOneHuman(@Qualifier("genOneUser")User user) {
        Human human = new Human();
        human.setName(user.getTitle());
        return human;
    }
    
    @Bean(name="aersa")
    public Human genHumanName(User user) {
        Human human = new Human();
        human.setName("aersa");
        return human;
    }
}
