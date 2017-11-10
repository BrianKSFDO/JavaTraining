package com.javaTraining.util;

// Add File as a Favorite by right-clicking on File tab
public class MathMethods {

    /**
     * Simple Addition method
     * @param s1 - first value to add
     * @param s2 - second value to add
     * @return - s1 and s2
     */
    public static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    /**
     * Simple Subtraction method
     * @param s1 - pass in first number
     * @param s2 - pass in second number
     * @return - s1 - s2
     */
    public static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    /**
     * Simple Multiplication method
     * @param s1 - pass in first number
     * @param s2 - pass in second number
     * @return - s1 x s2
     */
    public static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    /**
     * Simple Division method
     * @param s1 - pass in first number
     * @param s2 - pass in second number
     * @return - s1 / s2
     */
    public static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }
}
