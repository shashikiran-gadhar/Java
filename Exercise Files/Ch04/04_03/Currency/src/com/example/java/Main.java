package com.example.java;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        double value = .012;

        double pSum = value + value + value;

        System.out.println("pSum: " + pSum);

        String sVal = Double.toString(value);
        BigDecimal bVal = new BigDecimal(sVal);

        BigDecimal bSum = bVal.add(bVal).add(bVal);

        System.out.println("Big Decimal: " + bSum.toString());

    }

}
