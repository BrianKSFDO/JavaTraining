package com.javaTraining.strings;

import java.text.NumberFormat;
import java.util.Scanner;
import org.apache.commons.text.StrBuilder;

/**
 * Created by Brian on 10/2/2017.
 */
public class MainStrings {

    public static void main(String[] args) {

        //*****************************      PARSE Strings       ********************************
        String s1 = "Welcome Yall";
        System.out.println("Length of string: " + s1.length());

        int position = s1.indexOf("Yall");
        System.out.println("Position of string: " + position);

        String sub = s1.substring(0, 7);
        System.out.println("Substring: " + sub);

        String s2 = "Hi:          ";
        System.out.println("String: " + s2 + "!! \nLength: " + s2.length());

        s2 = s2.trim();
        System.out.println("String: " + s2 + "!! \nLength: " + s2.length());

        //*****************************      String Builder      ********************************
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("World");
        System.out.println(sb);

        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("Enter 3 values");
        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scan.nextLine();
            sb.append(input + "\n");
        }
        System.out.println(sb);

        //*****************************      String Builder      ********************************
        char[] chars = {'h', 'e', 'y'};
        System.out.println(chars);
        System.out.println(chars.toString());

        String s = new String(chars);
        System.out.println(s);
        System.out.println(s.toString());

        String hiUser = "User";
        char[] hiUserArray = hiUser.toCharArray();
        System.out.println(hiUserArray);

        for (char character : hiUserArray) {
            System.out.println(character);
        }

        //*****************************      StrBuilder      ********************************
        StrBuilder str = new StrBuilder().appendln("");
        str.appendln("New");
        str.appendln("Line");
        System.out.println("Using StrBuilder: " + str);

        //*****************************      Formatting      ********************************
        System.out.println("Here is text.\tThat was a tab.\nThat was a new line");
        System.out.print("use print ");
        System.out.print("instead of println");
        System.out.println();
        System.out.printf("Total cost %-10d; quantity %d \n", 5, 120); // Formatting characters offer more control. %-10d left aligned 10 characters long

        // Formatting integers
        for (int i = 0; i < 13; i++) {
            System.out.printf("%2d: text\n", i);
        }
        for (int i = 0; i < 13; i++) {
            System.out.printf("%-2d: text\n", i);
        }

        // Formatting floating point values
        System.out.printf("Total value: %f\n", 5.6);
        System.out.printf("Total value: %.2f\n", 5.6);
        System.out.printf("Total value: %.2f\n", 5.687);
        System.out.printf("Total value: %6.1f\n", 235.23687);

        //*****************************      Primitive To String ********************************
        int intVal = 42;
        String fromInt = Integer.toString(intVal);
        System.out.println(fromInt);

        boolean boolVal = true;
//		String fromBool = Boolean.toString(fromBool);

        long longVal = 10_000_000;
        System.out.println(longVal);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longVal);
        System.out.println(formatted);
    }
}
