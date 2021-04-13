package com.infoshareacademy;

public class Truck extends Vehicle {
    private String name = "default";

    public Truck() {
    }

    public Truck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
