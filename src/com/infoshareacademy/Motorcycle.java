package com.infoshareacademy;

public class Motorcycle extends Vehicle {
    private String name = "default";

    public Motorcycle() {
    }

    public Motorcycle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
