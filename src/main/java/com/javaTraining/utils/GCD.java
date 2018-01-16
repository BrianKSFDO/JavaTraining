package com.javaTraining.utils;

/**
 * Created by Brian on 1/15/2018
 */
public class GCD {

    public static void main(String[] args) {

        System.out.println(461952 % 116298);
        System.out.println(9 % 8);  // 1
        System.out.println(8 % 9);  // 8

        GCD gcd1 = new GCD();

        gcd1.euclidAlgorithm(461952, 116298); // 18
        gcd1.euclidAlgorithm(10, 25); // 5
        gcd1.euclidAlgorithm(3, 3); // 3

    }

    public int euclidAlgorithm(int x, int y) {

        int gcd;
        if (y == 0) {
            gcd = x;
            System.out.println("Answer is " + gcd);
            return gcd;
        } else return euclidAlgorithm(y, (x % y));
    }

/*    @Override
    public String toString() {
        return "Person Object, toString() Override {" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }*/
}
