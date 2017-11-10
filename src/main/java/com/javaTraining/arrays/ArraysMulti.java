package com.javaTraining.arrays;

import org.apache.commons.text.StrBuilder;

/**
 * Created by Brian on 10/15/2017.
 */
public class ArraysMulti {

    public static void main(String[] args) {

        int[][] grid = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};
        System.out.println(grid[0][0]);
        System.out.println(grid[1][0]);
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        String[][] capitals = new String[2][2];
        capitals[0][0] = "Cali";
        capitals[0][1] = "Sacremento";
        capitals[1][0] = "Oregon";
        capitals[1][1] = "Salem";

        for (int i = 0; i < capitals.length; i++) {
            StrBuilder str1 = new StrBuilder();
            str1.append("The capitol of ")
                    .append(capitals[i][0])
                    .append(" is ")
                    .append(capitals[i][1]);
            System.out.println(str1);
        }


    }
}
