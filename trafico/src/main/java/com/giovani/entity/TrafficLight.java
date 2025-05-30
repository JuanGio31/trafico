package com.giovani.entity;

public class TrafficLight extends Intersection {
    public TrafficLight(char light) {
        this.blocked = light != 'G';
        this.setSymbol(light);
    }

    public TrafficLight() {
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        if (this.blocked) {
            System.out.println("This intersection is blocked!");
        } else {
            super.addVehicle(vehicle);
        }
    }

    @Override
    public Vehicle getVehicle() {
        if (this.blocked) {
            return null;
        }
        return super.getVehicle();
    }

    public void switchState() {
        this.blocked = !this.blocked;
        System.out.println("The traffic light is now " + (this.blocked ? "blocked" : "unblocked"));
        this.setSymbol('R');
    }

    @Override
    public char getSymbol() {
        if (this.blocked) {
            return 'R';
        }
        return 'G';
    }
}