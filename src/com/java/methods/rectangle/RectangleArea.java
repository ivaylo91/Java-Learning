package com.java.methods.rectangle;

public class RectangleArea {
    public double width;
    public double height;

    public RectangleArea(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Double calcArea(){
        return width * height;
    }
}
