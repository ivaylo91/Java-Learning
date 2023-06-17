package com.java.methods.greatervalues;

public class GreaterValue {
    public int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }

    public char getMax(char first, char second) {
        if (Character.compare(first, second) >= 0) {
            return first;
        }
        return second;
    }

    public String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
