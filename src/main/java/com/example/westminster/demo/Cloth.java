package com.example.westminster.demo;

public class Cloth {

    private String name;
    private String color;
    private String size;

    public Cloth(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}