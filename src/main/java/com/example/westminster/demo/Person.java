package com.example.westminster.demo;

public class Person {

    private String name;
    private Cloth currentCloth;

    public Person(String name) {
        this.name = name;
    }

    // The behaviour your sir asked for
    public String wearCloth(Cloth cloth) {
        this.currentCloth = cloth;
        return name + " is wearing a " + cloth.getColor() + " " + cloth.getName()
                + " (size " + cloth.getSize() + ")";
    }

    public String getName() {
        return name;
    }

    public Cloth getCurrentCloth() {
        return currentCloth;
    }
}