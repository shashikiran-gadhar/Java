package com.example.java;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

            String s1 = getInput("Enter value 1: ");
            String s2 = getInput("Enter value 2: ");
            String ops = getInput("Enter Operation (+, -, *, /): ");

        try
        {
            switch (ops){
                case "+":
                    System.out.println("Tes result is:" + addValues(s1, s2));
                    break;
                case "-":
                    System.out.println("Tes result is:" + subValues(s1, s2));
                    break;
                case "*":
                    System.out.println("Tes result is:" + mulValues(s1, s2));
                    break;
                case "/":
                    System.out.println("Tes result is:" + divValues(s1, s2));
                    break;
                default:
                    System.out.println("Wrong Operation");
                    return;
        }
        }catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }



    }

    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }

    static double subValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 - d2;
        return result;
    }

    static double mulValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 * d2;
        return result;
    }

    static double divValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 / d2;
        return result;
    }





}
