package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Clifornia", "Sacremento");
        map.put("Washington", "Olmpia");
        map.put("Oregon", "Salem");

        System.out.println(map);

        map.put("Alaska", "Juneau");
        System.out.println(map);

        String cap = map.get("Alaska");
        System.out.println("The capitol of Alaska is " + cap);

        map.remove("Oregon");
        System.out.println(map);
    }

}
