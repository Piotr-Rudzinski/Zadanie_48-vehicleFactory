package com.infoshareacademy;

import java.util.List;
import java.util.Random;

public class App {

    public static void main( String[] args ) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle = generateRandomVehicleType();

        List<Vehicle> list = vehicleFactory.createVehicles(vehicle, generateVehicleAmount());

        System.out.println("Zamawiane obiekty: " + vehicle.getClass().getSimpleName());
        System.out.println();
        System.out.println("Klasa pierwszego obiektu w kolekcji: " + list.get(0).getClass().getSimpleName());
        System.out.println("Klasa ostatniego obiektu w kolekcji: " + list.get(list.size()-1).getClass().getSimpleName());
        System.out.println("Liczba obiektów w kolekcji: " + list.size());
    }

    private static Vehicle generateRandomVehicleType() {
        Random random = new Random();
        Vehicle[] vehicleType = {new Car("car"), new Boat("boat"), new Truck("truck"), new Motorcycle("motorcycle")};
        return vehicleType[random.nextInt(vehicleType.length)];
    }

    private static Integer generateVehicleAmount() {
        Random random = new Random();
        Integer amount = random.nextInt(9) + 1;
        return  amount;
    }
}
