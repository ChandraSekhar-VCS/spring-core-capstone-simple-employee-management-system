package com.chandrasekhar.springcore.capstone.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDepartmentResolver implements DepartmentResolver {
    @Override
    public String resolveDept() {
        return "PROD";
    }
}
