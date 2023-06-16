package com.java.methods.repeatString;

public class RepeatString {

    private String repeatString;
    private int count;

    public RepeatString(String repeatString, int count) {
        this.repeatString = repeatString;
        this.count = count;
    }

    public String repeat() {

        String line = "";
        for (int i = 0; i < count; i++) {
            line += repeatString;
        }
        return line;
    }

}
