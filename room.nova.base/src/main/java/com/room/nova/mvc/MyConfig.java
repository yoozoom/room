package com.room.nova.mvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafView;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.room.nova.mvc")
public class MyConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/classes/views/");
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setViewClass(JstlView.class);
        
//        SpringResourceTemplateResolver thymeleafViewResolver = new SpringResourceTemplateResolver();
//        thymeleafViewResolver.setPrefix("/WEB-INF/classes/views/");
//        thymeleafViewResolver.setSuffix(".html");
//        thymeleafViewResolver.setTemplateMode("HTML");
//        thymeleafViewResolver.setCacheable(false);
        
//        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
//        freeMarkerViewResolver.setPrefix("/WEB-INF/classes/views/");
//        freeMarkerViewResolver.setSuffix(".ftl");
//        
//        Map<String, ViewResolver> resolvers = new HashMap<>();
//        resolvers.put("jsp",internalResourceViewResolver);
//        resolvers.put("th",thymeleafViewResolver);
//        resolvers.put("ftl",freeMarkerViewResolver);

//        resover.setResolvers(resolvers);
        return internalResourceViewResolver;
    }
}
