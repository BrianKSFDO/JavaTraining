package com.javaTraining;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static com.javaTraining.util.MathMethods.*;

/**
 * This is my <b>Main</b> Runner class
 */

// TODO Need to finish this
public class Runner {

    //TIP click into anywhere in Java code, click CTRL + Q and local documentation will appear

    /**
     * My <i>main</i> method
     * @param args - values passed from command line
     */
    public static void main(String[] args) {

        // TIP click into anywhere in Java code, click SHIFT + F1 and online Java documentation will appear
        // this is setup at File > Other Settings > Default Project Structure > Documentation Paths > + button (with world)
        String name = "Len";
        String name2 = "Len";

        if (name.equals(name2))
            System.out.println("It equals!");

        // F11 to create a favorite
        System.out.println("F11 to create a Favorite");
        // sout + TAB
        System.out.println("Hello World!");

//        // TIP CTRL + SHIFT + ENTER will autocomplete line if possible (i.e. finish "); in a String
//        // TIP SHIFT + F6 will refactor/rename all instances (changed s1 to str1)
//        String str1 = getInput("Enter a numeric value: ");
//        String s2 = getInput("Enter a numeric value: ");
//        String operation = getInput("Choose an operation (+-/*): ");
//
//        double result;
//
//        switch (operation) {
//            case "+":
//                result = addValues(str1, s2);
//                break;
//            case "-":
//                result = subtractValues(str1, s2);
//                break;
//            case "/":
//                result = divideValues(str1, s2);
//                break;
//            case "*":
//                result = multiplyValues(str1, s2);
//                break;
//            default:
//                System.out.println("Invalid operation!  Select +*/-");
//                return;
//        }
//
//        System.out.println("Answer is: " + result);

        for (int i = 1; i < 3; i++) {
            System.out.println(i);
        }

        String[] colors = {"Red", "White", "Blue"};
        for (String color : colors){
            System.out.println(color);
        }

        Person p1 = new Person("Tim", "Test", 30);
        System.out.println(p1);

        Gson gson = new Gson();
        String p1gson = gson.toJson(p1);
        System.out.println("Output Person Object json: " + p1gson);

        JsonDisplay.showJson(p1);

    }

    private static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
