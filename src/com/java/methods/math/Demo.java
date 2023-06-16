package com.java.methods.math;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = Double.parseDouble(input.nextLine());
        int pow = Integer.parseInt(input.nextLine());

        MathPower math = new MathPower(number, pow);
        System.out.println(math.mathPower());
    }
}
