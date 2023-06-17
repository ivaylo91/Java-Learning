package com.java.methods.greatervalues;

public class GreaterValue {
    /**
     *
     * @param firstNum
     * @param secondNum
     * @return maxValue of Integer values
     */
    public int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }

    /**
     *
     * @param first
     * @param second
     * @return max value of two characters
     */
    public char getMax(char first, char second) {
        if (Character.compare(first, second) >= 0) {
            return first;
        }
        return second;
    }

    /**
     *
     * @param first
     * @param second
     * @return max value of two String values
     */
    public String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
