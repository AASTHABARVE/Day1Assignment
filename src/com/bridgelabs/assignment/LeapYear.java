package com.bridgelabs.assignment;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            scanner.close();

            if (year >= 1582) {
                boolean isLeapYear = false;

                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            isLeapYear = true;
                        }
                    } else {
                        isLeapYear = true;
                    }
                }

                if (isLeapYear) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println("Invalid input. The year must be greater than or equal to 1582.");
            }
        }
    }