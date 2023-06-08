package com.java.basics.passedFailed;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double grade = input.nextDouble();

        CheckPassedOrFailed checkPassedOrFailed = new CheckPassedOrFailed(grade);
        System.out.println(checkPassedOrFailed.printResult());
    }
}
