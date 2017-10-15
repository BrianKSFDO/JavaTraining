package com.example.idea.puzzles;

import org.junit.Assert;

/**
 * Created by Brian on 10/15/2017.
 */
public class ClockDegrees {

    public static double calcClockAngle(double h, double m) {

        //validate input
        if (h < 0 || m < 0 || h > 12 || m > 60)
            Assert.fail("invalid values for h or m");

        if (h == 12)
            h = 0;
        if (m == 60)
            m = 0;

        // Calculate angle moved by hour and minute hands with reference to 12:00
        double minute_angle = 6 * m;
        System.out.println("Minute: " + minute_angle);
        double hour_angle = (0.5 * (h * 60 + m));
        System.out.println("Hour: " + hour_angle);

        // Find diff between 2 angles
        double angle = Math.abs(hour_angle - minute_angle);

        // Return the small angle of 2 possible angles
        angle = Math.min(360 - hour_angle, angle);
        System.out.println("angle determined from class; " + angle);
        return angle;
    }
}
