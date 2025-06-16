package com.chandrasekhar.springcore.capstone.config;

import com.chandrasekhar.springcore.capstone.model.Employee;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.chandrasekhar.springcore.capstone")
@PropertySource("classpath:app.properties")
public class AppConfig {
    @Bean
    @Scope("prototype")
    public Employee employee() {
        return new Employee(null, null); // placeholders, will be set manually
    }
}
