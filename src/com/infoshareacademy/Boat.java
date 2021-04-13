package com.infoshareacademy;

public class Boat extends Vehicle {
    private String name = "default";

    public Boat() {
    }

    public Boat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
