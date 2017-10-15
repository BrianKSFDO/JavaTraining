package com.example.idea.puzzles;

import java.util.HashMap;

/**
 * Created by Brian on 10/15/2017.
 */
public class FirstDistinctNumber {

    public static void main(String[] args) {

        int intArray[] = {10, 1, 1, 10, 2, 3};
        System.out.println("BK: " + intArray[0]);

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < intArray.length; i++) {
            if (hashMap.containsKey(intArray[i])) {
                int tempCounter = hashMap.get(intArray[i]);
                tempCounter++;
                hashMap.put(intArray[i], tempCounter);
            } else {
                hashMap.put(intArray[i], 1);
            }
        }

        System.out.println("BK: " + hashMap.entrySet());

        for (int i = 0; i < intArray.length; i++) {
            if (hashMap.get(intArray[i]) == 1) {
                System.out.println("First distinct: " + intArray[i]);
                break;
            }
            else System.out.println("Enter loop again, did not find distinct value");
        }
    }
}
