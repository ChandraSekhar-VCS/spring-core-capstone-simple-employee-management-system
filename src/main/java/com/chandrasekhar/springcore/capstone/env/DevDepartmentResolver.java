package com.chandrasekhar.springcore.capstone.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDepartmentResolver implements DepartmentResolver {
    @Override
    public String resolveDept() {
        return "DEV";
    }
}
