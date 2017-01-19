package com.example.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        System.out.println("Ordered data");
        ArrayList<String> list = new ArrayList<String>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println("toString() output");
        System.out.println(list);
        System.out.println("");

        System.out.println("ArrayList iterator");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String val = iterator.next();
            System.out.println(val);
        }
        System.out.println("");

        System.out.println("ArrayList ForEach");
        for(String val1 : list)
            System.out.println(val1);
        System.out.println("");

        System.out.println("Java 8 method reference");
        list.forEach(System.out::println);
        System.out.println("");

        System.out.println("Unordered data");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);
        System.out.println("");

        System.out.println("HashMap Iterator");
        Set<String> keys = map.keySet();
        Iterator<String> iterator1 = keys.iterator();
        while(iterator1.hasNext()){
            String val1 = iterator1.next();
            System.out.println("The capitol of " + val1 + " is " + map.get(val1));
        }
        System.out.println("");

        System.out.println("HashMap ForEach");
        for(String key : keys)
            System.out.println("The capitol of " + key + " is " + map.get(key));
        System.out.println("");

    }

}
