package com.example.idea.puzzles;

/**
 * Created by Brian on 10/15/2017.
 */
public class Fibonacci {

//  0   1   1   2   3   5   8
// [0] [1] [2] [3] [4] [5] [6]
    public static int getFibonacci(int n) {

        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
