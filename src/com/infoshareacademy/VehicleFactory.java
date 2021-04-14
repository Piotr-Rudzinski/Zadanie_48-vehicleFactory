package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VehicleFactory {
    private final Random random = new Random();

    public List<Vehicle> createVehicles(String vehicleClassName, Integer amount) {
        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            vehicles.add(createVehicle(vehicleClassName));
        }
        return vehicles;
    }

    public Vehicle createVehicle(String vehicleClassName) {
/*        Class c = vehicle.getClass();
        String s = c.getName();*/

        if (vehicleClassName.equals("Car")) {
            return (Car) createCar();
        } else if (vehicleClassName.equals("Boat")) {
            return (Boat) createBoat();
        } else if (vehicleClassName.equals("Truck")) {
            return (Truck) createTruck();
        } else if (vehicleClassName.equals("Motorcycle")) {
            return (Motorcycle) createMotorcycle();
        }
        return null;
    }

    private Car createCar() {
        Car car = new Car();
        car.setName(generateCarName());
        return car;
    }

    private Boat createBoat() {
        Boat boat = new Boat();
        boat.setName(generateBoatName());
        return boat;
    }

    private Truck createTruck() {
        Truck truck = new Truck();
        truck.setName(generateTruckName());
        return truck;
    }

    private Motorcycle createMotorcycle() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setName(generateTruckName());
        return motorcycle;
    }

    private String generateCarName() {
        String[] names = {"Car1", "Car2", "Car3", "Car4", "Car5", "Car6"};
        return names[random.nextInt(names.length)];
    }

    private String generateBoatName() {
        String[] names = {"Boat1", "Boat2", "Boat3", "Boat4", "Boat5", "Boat6"};
        return names[random.nextInt(names.length)];
    }

    private String generateTruckName() {
        String[] names = {"Truck1", "Truck2", "Truck3", "Truck4", "Truck5", "Truck6"};
        return names[random.nextInt(names.length)];
    }

    private String generateMotorcycleName() {
        String[] names = {"Motorcycle1", "Motorcycle2", "Motorcycle3", "Motorcycle4", "Motorcycle5", "Motorcycle6"};
        return names[random.nextInt(names.length)];
    }
}