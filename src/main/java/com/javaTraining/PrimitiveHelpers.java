package com.javaTraining;

/**
 * Created by Brian on 10/31/2017.
 */
public class PrimitiveHelpers {

    public static void main(String[] args) {

        // Use Primitives
        byte b = 1; 	// 8 bits	-128 Min				127 Max
        short sh = 1;	// 16 bits	-32,768 Min				32,767 Max
        int i = 1;		// 32 bits	-2,147,483,648 Min		2,147,483,647 Max
        long l = 1;		// 64 bits	-9.22337E+18 Min		9.22337E+18 Max
        float f = 1f;	// 32 bits
        double d = 1d;	// 64 bits

        System.out.println("byte: " + b);
        System.out.println("short: " + sh);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // Use Primitive Helper classes
        byte b1 = 127;
        System.out.println("byte: " + b1);

        if (b1 < Byte.MAX_VALUE) { // Byte with uppercase is the helper class.  MAX_VALUE is a constant (aka static field)
            b1++;
        }
        System.out.println("byte: " + b1); // value is 127

        //if you are at Max Value and add one, you will wrap around to the min value
        System.out.println("value of b1: " + b1);
        System.out.println("value of Byte.MAX_VALUE: " + Byte.MAX_VALUE);
        b1++;
        System.out.println("if b1 is at Max Value, and 1 is added, it wraps to the min value: " + b1);
        System.out.println("value of Byte.MIN_VALUE: " + Byte.MIN_VALUE);

        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Short Min: " + Short.MIN_VALUE);
        System.out.println("Short Max: " + Short.MAX_VALUE);
        System.out.println("Integer Min: " + Integer.MIN_VALUE);
        System.out.println("Integer Max: " + Integer.MAX_VALUE);
        System.out.println("Long Min: " + Long.MIN_VALUE);
        System.out.println("Long Max: " + Long.MAX_VALUE);
        System.out.println("Float Min: " + Float.MIN_VALUE);
        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Double Min: " + Double.MIN_VALUE);
        System.out.println("Double Max: " + Double.MIN_VALUE);

    }
}
