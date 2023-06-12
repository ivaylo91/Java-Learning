package com.java.variables;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MetersInKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double meters = Double.parseDouble(input.nextLine());
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(convert(meters)));

    }

    public static double convert(double meters) {
        return meters * 0.001;
    }

}
