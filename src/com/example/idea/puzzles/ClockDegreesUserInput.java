package com.example.idea.puzzles;

import java.util.Scanner;

/**
 * Created by Brian on 10/15/2017.
 */
public class ClockDegreesUserInput {

    public static void main(String[] args) {

        boolean isInt = false;
        int hours = 0;
        int minutes = 0;
        String input = "";

        while (!isInt) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the time in Hours and Minutes to return degree difference");

            input = in.next();
            String splitHourMin [] = input.split(":");

            if (!(splitHourMin[0].length() > 0 && splitHourMin[0].length() < 3)) {
                System.out.println("FALSE, Hour needs to have between 1 and 2 digits");
                isInt = false;
                break;
            }

            if (!(splitHourMin[1].length() > 0 && splitHourMin[1].length() < 3)) {
                System.out.println("FALSE, Minutes needs to have between 1 and 2 digits");
                isInt = false;
                break;
            }

            hours = Integer.parseInt(splitHourMin[0]);
            minutes = Integer.parseInt(splitHourMin[1]);

            if (hours >= 0 && hours <= 12 && minutes >= 0 && minutes <= 60) {
                System.out.println("Hours between 0-12, Minutes between 0-60");
                isInt = true;
            } else {
                System.out.println("FALSE, need to enter valid time in HH:MM with HH between 0-12 and MM 0-60");
            }
        }
        System.out.println(input + " time on a clock has degree difference between Hours and Minutes as "
                + ClockDegrees.calcClockAngle(hours, minutes));


    }
}
