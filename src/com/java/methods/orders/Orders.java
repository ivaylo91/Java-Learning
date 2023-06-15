package com.java.methods.orders;

public class Orders {

    public Double order(String product, int quantity) {
        double result;

        if (product.equals("water")) {
            result = quantity * 1.00;
        } else if (product.equals("coffee")) {
            result = quantity * 1.50;
        } else if (product.equals("coke")) {
            result = quantity * 1.40;
        } else {
            result = quantity * 2.00;
        }
        return result;
    }
}
