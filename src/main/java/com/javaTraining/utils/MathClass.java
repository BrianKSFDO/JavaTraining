package com.javaTraining.utils;

/**
 * Created by Brian on 10/31/2017.
 */
public class MathClass {

    public static void main(String[] args) {

        int intVal1 = 56;
        int intVal2 = 42;

        int result1 = intVal1 + intVal2;
        System.out.println("Addition: " + result1);
        System.out.println("Concatenate: " + intVal1 + intVal2);

        int result2 = intVal1 - intVal2;
        System.out.println("Subtraction: " + result2);

        int result3 = intVal1 * intVal2;
        System.out.println("Multiplication: " + result3);

        int result4 = intVal1 / intVal2;
        System.out.println("Division: " + result4);
        double result5 = (double) intVal1 / intVal2;
        System.out.println("Division: " + result5);

        int result6 = intVal1 % intVal2;
        System.out.println("Modulus/Remainder: " + result6);

        double doubleVal = -3.999999;
        long rounded = Math.round(doubleVal);
        System.out.println("Math.round: " + rounded);
        System.out.println("Math.round: " + Math.round(doubleVal));

        double absValue = Math.abs(doubleVal);
        System.out.println("Math.abs: " + absValue);
    }
}
