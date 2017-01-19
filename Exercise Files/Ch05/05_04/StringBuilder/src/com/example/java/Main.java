package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        StringBuilder sb = new StringBuilder()
            .append("Hello")
            .append("World!");
        System.out.println(sb);
        sb.delete(0, sb.length());
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the values below:");
        String input;
        for (int i = 0; i < 3; i++) {
            input = sc.nextLine();
            sb.append(input + "\n");
        }

        System.out.println(sb);

    }

}
