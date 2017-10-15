package com.example.idea.arrays;

import java.util.Arrays;

/**
 * Created by Brian on 10/15/2017.
 */
public class Arrayss {

    public static void main(String[] args) {

        int value = 7;

        System.out.println(value);

        int[] values = {1,2,3};

        System.out.println(values[0]);

        for (int val : values) {
            System.out.println("value in enhanced for loop: " + val);
        }

        for (int i = 0; i < values.length; i++){
            System.out.println("value in old loop: " + values[i]);
        }

        ////////////////////  SORTING  ///////////////////////////////////
        int[] ints = {9, 6, 3};
        Arrays.sort(ints);
        for (int in : ints){
            System.out.println(in);
        }

        String[] strings = {"Red", "Blue", "Green"};
        Arrays.sort(strings);
        for (String s : strings){
            System.out.println(s);
        }

        ////////////////////  SIZED  ///////////////////////////////////

        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 100;
        }
        for (int value2 : sized) {
            System.out.println(value2);
        }

        ////////////////////  COPYING  ///////////////////////////////////
        System.out.println("Copy an array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 5);
        for (int val : copied) {
            System.out.println(val);
        }

    }

}
