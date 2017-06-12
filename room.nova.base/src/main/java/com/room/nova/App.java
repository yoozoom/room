package com.room.nova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServletComponentScan
@ImportResource(value = { "classpath:application-bean.xml" })
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        
    }
}