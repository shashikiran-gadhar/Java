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
        olive2.setOil(20);
        olives.add(olive2);
        Olive olive3 = new Olive();
        olive3.setOil(4);
        olives.add(olive3);
        Olive olive4 = new Olive();
        olive4.setOil(4);
        olives.add(olive4);

        OlivePress press = new OlivePress();
        System.out.println("Total oil " + press.getOil(olives));

    }

}

