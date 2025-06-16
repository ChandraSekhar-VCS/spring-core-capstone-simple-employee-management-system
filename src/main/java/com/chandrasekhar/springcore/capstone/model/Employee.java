package com.chandrasekhar.springcore.capstone.model;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

    @Value("#{T(com.chandrasekhar.springcore.capstone.util.IdGeneratorUtil).generateId()}")
    private String id;

    private String name;

    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return  "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
    }
}
