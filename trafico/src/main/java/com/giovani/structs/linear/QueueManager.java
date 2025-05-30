package com.giovani.structs.linear;

import com.giovani.entity.Vehicle;

import java.util.ArrayList;

public class QueueManager {
    private static final int MAX_VEHICLES = 4;
    private ArrayList<Vehicle>[] vehicles;
    private int size;

    public QueueManager() {
        this.size = 0;
        vehicles = new ArrayList[MAX_VEHICLES];
        for (int i = 0; i < MAX_VEHICLES; i++) {
            vehicles[i] = new ArrayList<>();
        }
    }

    public void add(Vehicle vehicle) {
        int priorityLevel = getPriorityLevel(vehicle);
        if (priorityLevel == -1) {
            System.out.println("Error en el nivel de prioridad");
            return;
        }
        vehicles[priorityLevel].add(vehicle);
        size++;
    }

    public Vehicle poll() {
        for (int i = 0; i < MAX_VEHICLES; i++) {
            if (!vehicles[i].isEmpty()) {
                size--;
                return vehicles[i].removeFirst();
            }
        }
        return null;
    }

    private int getPriorityLevel(Vehicle vehicle) {
        String type = vehicle.getType();
        return switch (type.toLowerCase()) {
            case "ambulancia" -> 0;
            case "policia" -> 1;
            case "transporte" -> 2;
            case "particular" -> 3;
            default -> -1;
        };
    }

    public ArrayList<Vehicle>[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle>[] vehicles) {
        this.vehicles = vehicles;
    }

    public int getSize() {
        return size;
    }
}