package com.example.java;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by shashi on 02-01-2017.
 */
public class MyMain {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String input1 = sc.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.print("Enter the second number: ");
        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1 + d2;

        System.out.println("Result is: " + result);
    }
}
