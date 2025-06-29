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

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getDepartment() {return department;}
    public void setDepartment(String department) {this.department = department;}

    @Override
    public String toString() {
        return  "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
    }
}
