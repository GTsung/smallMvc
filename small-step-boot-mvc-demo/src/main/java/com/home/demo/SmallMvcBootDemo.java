package com.home.demo;

import com.mvc.configure.context.ServletWebServerApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author GTsung
 * @date 2021/10/18
 */
@SpringBootApplication
public class SmallMvcBootDemo {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SmallMvcBootDemo.class);
        application.setApplicationContextClass(ServletWebServerApplicationContext.class);
        application.run(args);
    }
}
