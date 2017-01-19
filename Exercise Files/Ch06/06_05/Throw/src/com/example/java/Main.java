package com.example.java;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);

            String sub = welcome.substring(3);
            System.out.println("Substring: " + sub);

            if(chars.length < 10){
                throw (new Exception("My custom exception"));
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index problem!");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

}
