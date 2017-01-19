package com.example.java;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }

}
