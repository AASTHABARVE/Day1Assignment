
//1.6 Write a program to demonstrate static variables, methods, and blocks.


package com.bridgelabs.assignment;

public class StaticExa {

    static int a=22;
    static int b=3;
    static int add;
    public static int sum() {
        add = a+b;
        return add;
    }

    public static void main(String[] args) {
        sum();
        System.out.println("Sum of num: " +add);
    }

}
