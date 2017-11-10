package com.javaTraining.iterators;

import java.util.Scanner;

/**
 * Created by Brian on 10/31/2017.
 */
public class DoWhile {

    public static void main(String[] args) {

        int value;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }

        while (value != 5);
        System.out.println("You found 5!");
    }
}
