package com.chandrasekhar.springcore.capstone.controller;

import com.chandrasekhar.springcore.capstone.model.Employee;
import com.chandrasekhar.springcore.capstone.service.EmployeeService;
import com.chandrasekhar.springcore.capstone.service.Notifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Value("${app.name}")
    private String appName;

    private EmployeeService employeeService;
    private Notifier notifier;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    public void setNotifier(Notifier notifier){
        this.notifier = notifier;
    }

    public void run(){
        System.out.println("Application Name : " + appName);
        Employee employee = employeeService.registerEmployee("Chandra");
        System.out.println("Environment: " + employee.getDepartment());
        System.out.println(employee);
        notifier.notify(employee);
    }
}
