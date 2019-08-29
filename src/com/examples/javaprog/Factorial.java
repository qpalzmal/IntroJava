package com.examples.javaprog;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number for the factorial: ");
        int user_num = s.nextInt();

        System.out.println(factorial(user_num));
    }

    private static int factorial(int number) {
        if (number >= 0) {  // factorial if the given number is positive
            if (number <= 0) {
                return 1;
            } else {
                return number *= factorial(number -= 1);
            }
        } else {  // factorial if the given number is negative
            if (number >= 0) {
                return 1;
            } else {
                return number *= factorial(number += 1);
            }
        }
    }
}