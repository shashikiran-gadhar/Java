package com.example.java;

import com.example.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive("Kalamata", (long) 20, 3));
        olives.add(new Olive("Kalamata", (long) 20, 12));
        olives.add(new Olive("Kalamata", (long) 20, 1));
        olives.add(new Olive("Kalamata", (long) 20, 3));


        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);

    }

}

