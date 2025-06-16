package com.chandrasekhar.springcore.capstone.repository;

import com.chandrasekhar.springcore.capstone.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Employee saved to repository: " + employee);
    }
}
