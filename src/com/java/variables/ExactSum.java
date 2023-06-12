package com.java.variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        BigDecimal sum  = new BigDecimal(0);
        for(int i=1; i<= n; i++){
            BigDecimal number = new BigDecimal(input.nextLine());
            sum = sum.add(number);
        }
        System.out.println(sum);
    }
}
