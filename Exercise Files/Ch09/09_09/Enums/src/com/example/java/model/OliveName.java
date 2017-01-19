package com.example.java.model;

public enum OliveName {

    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
