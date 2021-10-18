package com.mvc.config;

import com.mvc.annotation.EnableWebMvc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author GTsung
 * @date 2021/10/18
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mvc")
public class AppConfig {
}
