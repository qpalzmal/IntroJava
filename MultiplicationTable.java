package com.examples.javaprog;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = s.nextInt();

        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                System.out.print(" " + (row * column));
            }
            System.out.println();
        }
    }
}
