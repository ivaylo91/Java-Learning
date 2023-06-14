package com.java.methods.signofintegers;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        SignOfIntegers checkSign = new SignOfIntegers();
        checkSign.checkSignOfInteger(number);
    }
}
