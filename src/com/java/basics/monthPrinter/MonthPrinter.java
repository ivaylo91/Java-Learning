package com.java.basics.monthPrinter;

import java.util.Scanner;

public class MonthPrinter {
    private final int month;

    public MonthPrinter(int month){
        this.month = month;
    }
    public String printMonth(String[] months){
        if(month <= months.length){
            return months[month-1];
        }else{
            return "Error!";
        }
    }
}
