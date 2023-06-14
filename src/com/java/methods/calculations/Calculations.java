package com.java.methods.calculations;

public class Calculations {
    public int calculate(String operation, int num1, int num2) {
        int result;
        if (operation.equals("subtract")) {
            result = num1 - num2;
        } else if (operation.equals("add")) {
            result = num1 + num2;
        } else if (operation.equals("multiply")) {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }
        return result;
    }
}
