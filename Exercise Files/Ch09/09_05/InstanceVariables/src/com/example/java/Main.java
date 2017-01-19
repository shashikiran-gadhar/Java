package com.example.java;

import com.example.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        Olive olive1 = new Olive();
        olives.add(olive1);
        Olive olive2 = new Olive();
        olives.add(olive2);
        Olive olive3 = new Olive();
        olives.add(olive3);
        Olive olive4 = new Olive();
        olives.add(olive4);

        OlivePress press = new OlivePress();
        System.out.println("Total Oil produced in liters is " + press.oil(olives));
    }

}

