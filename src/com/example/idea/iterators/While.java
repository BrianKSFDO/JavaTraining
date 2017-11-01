package com.example.idea.iterators;

/**
 * Created by Brian on 10/31/2017.
 */
public class While {

    public static void main(String[] args) {

        int value = 0;

        while (value < 3) {
            System.out.println("Hello " + value);

            value++; // or value = value + 1
        }

        int loop = 0;

        while (true) {
            System.out.println("Looping: " + loop);

            if (loop == 2) {
                System.out.println("reached loop = 2, break out of While");
                break;
            }

            loop++;
            System.out.println("Running");
        }

    }
}
