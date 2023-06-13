package com.java.variables;

import java.util.Scanner;

public class CharIntoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        for(int i=0; i<3; i++){
            char ch = input.next().charAt(0);
            line+=ch;
        }
        System.out.println(line);
    }
}
