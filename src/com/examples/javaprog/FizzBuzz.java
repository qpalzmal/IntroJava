package com.examples.javaprog;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer: ");  // user inputs a number for the program to go up to
        int user_num = s.nextInt();

        if (user_num > 0) {  // used with positive number to check for 0 to given number
            for (int i = 0; i < user_num; i++) {
                checker(i);
            }
        } else {  // used with negative number to check given number to 0
            for (int i = 0; i > user_num; i--) {
                checker(i);
            }
        }
    }

    private static void checker(Integer i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz: " + i); // number is divisible by both 3 and 5
        } else if (i % 3 == 0) {
            System.out.println("Fizz: " + i);     // number is divisible by 3 not 5
        } else if (i % 5 ==0) {
            System.out.println("Buzz: " + i);         // number is divisible by 5 not 3
        } else {
            System.out.println("Nothing: " + i);      // number isn't divisible by both 3 and 5
        }
    }
}
