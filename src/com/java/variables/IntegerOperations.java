package com.java.variables;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int sum = num1 + num2;
        int result = (sum / num3) * num4;

        System.out.println(result);

    }
}
