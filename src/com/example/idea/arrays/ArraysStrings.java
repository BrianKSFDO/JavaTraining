package com.example.idea.arrays;

/**
 * Created by Brian on 10/15/2017.
 */
public class ArraysStrings {

    public static void main(String[] args) {

        String[] strings = {"eince", "zwei", "drei"};

        for (String string : strings) {
            System.out.println(string);
        }

        String text = null;
        System.out.println(text);

        String[] text2 = new String[3];
        System.out.println(text2[0]);
        System.out.println(text2[1]);
        System.out.println(text2[2]);
        //System.out.println(texts[3]); // this will throw Array Out of Bounds Exceptions

    }
}
