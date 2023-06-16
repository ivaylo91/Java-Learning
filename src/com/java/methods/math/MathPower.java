package com.java.methods.math;

public class MathPower {
    private double number;
    private int pow;

    public MathPower(double number, int pow) {
        this.number = number;
        this.pow = pow;
    }

    public double mathPower() {
        return Math.pow(number,pow);
    }
}
