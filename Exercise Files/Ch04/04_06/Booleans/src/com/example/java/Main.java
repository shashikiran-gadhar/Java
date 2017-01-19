package com.example.java;

public class Main {

    static boolean bdef = true;

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is: " + b1);
        System.out.println("The value of b2 is: " + b2);
        System.out.println("The value of bdef is: " + bdef);

        int i = 1;
        boolean b3 = (i != 1);
        System.out.println("The value of b3 is: " + b3);

        String sBoolean = "true";
        boolean b4 = Boolean.parseBoolean(sBoolean);
        System.out.println("The value of b4 is: " + b4);

    }

}
