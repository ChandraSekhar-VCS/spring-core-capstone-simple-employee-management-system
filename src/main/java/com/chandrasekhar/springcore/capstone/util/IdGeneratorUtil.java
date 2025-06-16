package com.chandrasekhar.springcore.capstone.util;

public class IdGeneratorUtil {
    public static final String PREFIX = "EMP";

    public static String generateId() {
        return PREFIX + ((int)(Math.random() * 900 + 100));
    }
}
