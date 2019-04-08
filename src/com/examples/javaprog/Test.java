package com.examples.javaprog;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("REEE");
    }
}

class FizzBuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer: ");  // user inputs a number for the program to go up to
        int user_num = s.nextInt();

        if (user_num > 0) {
            for (int i = 0; i < user_num; i++) {
                checker(i);
            }
        } else {
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

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = s.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.println();
            for (int j = 1; j <= size; j++) {
                System.out.print(" " + (i * j));
            }
        }
    }
}

class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number for the factorial: ");
        int user_num = s.nextInt();

        String sign_num = "";

        if (user_num >= 0) {
            sign_num += "positive";
        } else {
            sign_num += "negative";
        }

        System.out.println(factorial(user_num, 1, sign_num));
    }

    private static int factorial(int number, int total, String sign) {
        if (sign.toLowerCase().equals("positive")) {
            if (number <= 0) {
                return total;
            } else {
                total *= number;
                return factorial(number -= 1, total, sign);
            }
        } else {
            if (number >= 0) {
                return total;
            } else {
                total *= number;
                return factorial(number += 1, total, sign);
            }
        }
    }
}
