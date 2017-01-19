package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Cali");
        list.add("MA");
        list.add("WA");

        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String state = list.get(1);
        System.out.println("The second is state is " + state);

        int pos = list.indexOf("MA");
        System.out.println("The position of WA is " + pos);
    }

}
