package com.examples.javaprog;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String word = s.next();
        int len = word.length();
        String first_half = word.substring(0, len / 2);
        String last_half = "";

        for (int i = 0; i < len / 2; i++) {
             last_half += ((word.charAt(len - (i + 1))));
        }
        if (first_half.equalsIgnoreCase(last_half)) {
            System.out.println("Your word is a palindrome");
        } else {
            System.out.println("Your word isn't a palindrome");
        }
    }
}
