package com.giovani.structs.nonlinear;

import com.giovani.entity.Vehicle;

import java.util.HashMap;

public class VehiclesManager {
    private final HashMap<String, Vehicle> vehicles;

    public VehiclesManager() {
        this.vehicles = new HashMap<>();
    }

    public void addVehicle(String plate, Vehicle vehicle) {
        if (searchVehicle(plate)) {
            System.out.println("This plate already exists!");
        } else {
            this.vehicles.put(plate, vehicle);
        }
    }

    public boolean searchVehicle(String plate) {
        return this.vehicles.containsKey(plate);
    }

    public Vehicle getVehicle(String plate) {
        if (searchVehicle(plate)) {
            return this.vehicles.get(plate);
        }
        return null;
    }
}
