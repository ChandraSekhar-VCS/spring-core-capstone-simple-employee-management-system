package com.chandrasekhar.springcore.capstone.service;

import com.chandrasekhar.springcore.capstone.model.Employee;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Notifier {
    @PostConstruct
    public void init() {
        System.out.println("Notifier initialized");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Notifier shutting down");
    }

    public void notify(Employee employee) {
        System.out.println("Notification sent to: " + employee.getName());
    }
}
