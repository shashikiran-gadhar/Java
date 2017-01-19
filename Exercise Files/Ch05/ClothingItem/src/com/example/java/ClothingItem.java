package com.example.java;

/**
 * Created by shashi on 25-12-2016.
 */
public class ClothingItem {

    public String type;


    public void displayitem(){
        System.out.println("The valuse of the type is: " + this.type);
    }

    public static void main(String[] args){
        ClothingItem item = new ClothingItem();
        item.type = "Shashi";
        item.displayitem();

    }
}
