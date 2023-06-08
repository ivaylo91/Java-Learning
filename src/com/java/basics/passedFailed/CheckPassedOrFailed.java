package com.java.basics.passedFailed;

public class CheckPassedOrFailed {
    private final double grade;

    public CheckPassedOrFailed(double grade){
        this.grade = grade;
    }
    public String printResult(){
        if(grade >=2.99){
            return "Passed!";
        }else{
            return "Failed!";
        }
    }
}
