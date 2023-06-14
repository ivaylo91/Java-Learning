package com.java.variables;

import java.util.Scanner;

public class PrintPartOfAscii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startInterval = Integer.parseInt(input.nextLine());
        int endInterval = Integer.parseInt(input.nextLine());
        String line = "";
        for (int i = startInterval; i <= endInterval; i++) {

            line+=(char)i;
        }
        System.out.println(line);
    }
}
