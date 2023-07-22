package com.bridgelabs.assignment;

public class StringEqual {
    public static void main(String[] args) {
        String str1 = "Aastha";
        System.out.println("first string: " + str1);

        String str2 = "Aastha";
        System.out.println("first string: " + str2);

        if (str1 == str2) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}