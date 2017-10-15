package com.example.idea.general;

/**
 * Created by Brian on 10/15/2017.
 */
public class Booleans {

    static boolean bDef;

    public static void main(String[] args) {


        boolean b1 = true;
        boolean b2 = false;
        System.out.println("value of b1: " + b1);
        System.out.println("value of b2: " + b2);
        System.out.println("value of bDef (defaults to false if not assigned): " + bDef);
        System.out.println("!bDef: " + !bDef);

        int i = 1;
        boolean b3 = (i == 1);
        System.out.println(b3);

// Failing on my local machine
		String sBoolean = "true";
		boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println(parsed);
    }
}
