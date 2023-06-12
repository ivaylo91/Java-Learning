package com.java.variables;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String delimiter = input.nextLine();
        String lastName = input.nextLine();

        System.out.println(concat(firstName,delimiter,lastName));
    }
    public static String concat(String firstName, String delimiter, String lastName){
        return firstName + delimiter + lastName;
    }
}
