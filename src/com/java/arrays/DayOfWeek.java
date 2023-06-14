package com.java.arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        int day = Integer.parseInt(input.nextLine());

        if (day <= daysOfWeek.length) {
            System.out.println(daysOfWeek[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
