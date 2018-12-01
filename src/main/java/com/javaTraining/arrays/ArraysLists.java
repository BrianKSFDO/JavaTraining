package com.javaTraining.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian on 10/15/2017.
 */
public class ArraysLists {

    public static void main(String[] args) {

        ArrayList<String> stringers = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>(); // This would also work, same as line above

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println(numbers.get(2));


        for (int i =0; i < numbers.size(); i++) {
            System.out.println("Standard For Loop: " + numbers.get(i));
        }

        // Remove last item in array
        numbers.remove(numbers.size() - 1);
        for (Integer num : numbers) {
            System.out.println("Enhanced For Loop: " + num);
        }

        numbers.remove(0);
        System.out.println(numbers);
    }
}
