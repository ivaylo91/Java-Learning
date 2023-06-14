package com.java.methods.signofintegers;

public class SignOfIntegers {
    public void checkSignOfInteger(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative", number);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
