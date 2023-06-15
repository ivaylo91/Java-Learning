package com.java.methods.orders;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String product = input.nextLine();
        int quantity = Integer.parseInt(input.nextLine());
        DecimalFormat df = new DecimalFormat("0.00");
        Orders order = new Orders();
        System.out.println(df.format(order.order(product, quantity)));
    }
}
