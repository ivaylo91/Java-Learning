package com.java.basics.passed;

import java.text.DecimalFormat;

public class checkPassed {
    private final double grade;
    public checkPassed(double grade){
        this.grade = grade;
    }
    public String printResult(){
        if(grade >=3.00){
            return  "Passed!";
        }else{
            return " ";
        }
    }
}
