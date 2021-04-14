package com.infoshareacademy;

import java.util.List;
import java.util.Random;

public class App {

    public static void main( String[] args ) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        String vehicleName = generateRandomVehicleType();

        List<Vehicle> list = vehicleFactory.createVehicles(vehicleName, generateVehicleAmount());

        System.out.println("Zamawiane obiekty: " + vehicleName);
        System.out.println();
        System.out.println("Klasa pierwszego obiektu w kolekcji: " + list.get(0).getClass().getSimpleName());
        System.out.println("Klasa ostatniego obiektu w kolekcji: " + list.get(list.size()-1).getClass().getSimpleName());
        System.out.println("Liczba obiektów w kolekcji: " + list.size());
    }

    private static String generateRandomVehicleType() {
        Random random = new Random();
        String[] vehicleClassName = {"Car", "Boat", "Truck", "Motorcycle"};
        return vehicleClassName[random.nextInt(vehicleClassName.length)];
    }

    private static Integer generateVehicleAmount() {
        Random random = new Random();
        Integer amount = random.nextInt(9) + 1;
        return  amount;
    }
}
