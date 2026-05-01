package com.suka.blyat;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.info("Đang thực hiện phép cộng: {} + {} 🎶", a, b);
        return a + b;
    }
}