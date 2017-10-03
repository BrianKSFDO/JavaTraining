package com.example.idea;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian on 9/30/2017.
 */
public class JsonDisplay {

    public static String showJson(Object object) {

        Gson gson = new Gson();
        String p1gson = gson.toJson(object);
        System.out.println("Output Person Object json from different project: " + p1gson);

        String[] colors = {"Red", "White", "Blue"};
        Gson gson2 = new Gson();
        String colorsGson = gson.toJson(colors);
        System.out.println("String Array json: " + colorsGson);

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(3);
        Gson gson3 = new Gson();
        String intListGson = gson3.toJson(ints);
        System.out.println("List of Integers json: " + intListGson);

        return null;
    }
}
