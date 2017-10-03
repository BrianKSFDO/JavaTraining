package com.example.idea.Strings;

import java.util.Scanner;

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
    }
}
