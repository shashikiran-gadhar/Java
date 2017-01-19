package com.example.java;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);

            String sub = welcome.substring(1);
            System.out.println("Substring: " + sub);

            char c = welcome.charAt(-1);
            System.out.println("Character c:" + c);

        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Array index problem!!");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Substring Problem!!");
        }

    }

}
