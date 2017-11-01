package com.example.idea;

import java.util.Scanner;

/**
 * Created by Brian on 10/31/2017.
 */
public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text: ");
        String line = input.nextLine();

        System.out.println("You entered: " + line);

        System.out.println("Enter a line of number: ");
        int value = input.nextInt();

        System.out.println("You entered number: " + value);
    }
}
