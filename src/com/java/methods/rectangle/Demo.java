package com.java.methods.rectangle;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = Double.parseDouble(input.nextLine());
        double height = Double.parseDouble(input.nextLine());

        RectangleArea rectangle = new RectangleArea(width,height);
        System.out.println(rectangle.calcArea());
    }
}
