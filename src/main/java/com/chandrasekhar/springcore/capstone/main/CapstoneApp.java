package com.chandrasekhar.springcore.capstone.main;

import com.chandrasekhar.springcore.capstone.config.AppConfig;
import com.chandrasekhar.springcore.capstone.controller.EmployeeController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CapstoneApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(AppConfig.class);
        context.refresh();
        EmployeeController employeeController = context.getBean(EmployeeController.class);
        employeeController.run();
        context.close();
    }
}
