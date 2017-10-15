package com.example.idea.puzzles;

import java.util.Scanner;

/**
 * Created by Brian on 10/15/2017.
 */
public class FibonacciUserInput {

    public static void main(String[] args) {

        boolean isInt = false;
        int input = 0;
        while (!isInt) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the nth position of the Fibonacci sequence you want returned");

            if (in.hasNextInt()) {
                System.out.println("TRUE! set bool to true");
                input = in.nextInt();
                isInt = true;
            } else {
                System.out.println("FALSE, need to enter INT");
            }
        }

        System.out.println(input + "th position in Fibonacci sequence is " + Fibonacci.getFibonacci(input));
    }
}
