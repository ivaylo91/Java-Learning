package com.java.variables;

import java.util.Scanner;

public class CheckLowerOrUppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
