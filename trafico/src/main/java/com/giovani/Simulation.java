package com.giovani;

import com.giovani.entity.City;
import com.giovani.extras.FileManager;
import com.giovani.structs.nonlinear.VehiclesManager;

public class Simulation {
    private static final int SIMULATION_TIME = 1000;
    private City city;
    private VehiclesManager vehiclesManager;
    private FileManager fileManager;

    public Simulation() {
        this.city = new City();
        this.vehiclesManager = new VehiclesManager();
        fileManager = new FileManager(this);
    }

    public void run() {
        fileManager.readCSV();
        city.getMatrix().createObstructions();
        System.out.println("Simulation started!");
        city.printCity();
        System.out.println("Simulation ended!");
    }

    public static void main(String[] args) {
        //25
        Simulation simulation = new Simulation();
        simulation.run();
        System.out.println("Program ended!");
    }
}
