package com.chandrasekhar.springcore.capstone.service;

import com.chandrasekhar.springcore.capstone.env.DepartmentResolver;
import com.chandrasekhar.springcore.capstone.model.Employee;
import com.chandrasekhar.springcore.capstone.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    private DepartmentResolver departmentResolver;

    public  EmployeeService(EmployeeRepository employeeRepository, DepartmentResolver departmentResolver) {
        this.employeeRepository = employeeRepository;
        this.departmentResolver = departmentResolver;
    }

    public Employee registerEmployee(String name) {
        String department  = departmentResolver.resolveDept();
        Employee employee = new Employee(name, department);
        employeeRepository.save(employee);
        return employee;
    }
}
