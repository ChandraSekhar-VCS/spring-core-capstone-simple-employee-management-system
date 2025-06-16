package com.chandrasekhar.springcore.capstone.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.chandrasekhar.springcore.capstone")
@PropertySource("classpath:app.properties")
public class AppConfig {
}
