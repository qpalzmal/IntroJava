package com.examples.javaprog;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number for the factorial: ");
        int user_num = s.nextInt();

        String sign_num;

        if (user_num >= 0) {
            sign_num = "positive";
        } else {
            sign_num = "negative";
        }

        System.out.println(factorial(user_num, sign_num));
    }

    private static int factorial(int number, String sign) {
        if (sign.toLowerCase().equals("positive")) {  // factorial if the given number is positive
            if (number <= 0) {
                return 1;
            } else {
                return number *= factorial(number -= 1, sign);
            }
        } else {  // factorial if the given number is negative
            if (number >= 0) {
                return 1;
            } else {
                return number *= factorial(number += 1, sign);
            }
        }
    }
}
