package com.giovani.entity;

import com.giovani.extras.Position;

public class Vehicle {
    private String type;
    private String plate;
    private Position origin;
    private Position destination;
    private int urgencyLevel;
    private int waitingTime;
    private Position currentPosition;
    private int travelTime;

    public Vehicle(String type, String plate, Position origin, Position destination, int urgencyLevel, int waitingTime) {
        this.type = type;
        this.plate = plate;
        this.origin = origin;
        this.currentPosition = origin;
        this.destination = destination;
        this.urgencyLevel = urgencyLevel;
        this.waitingTime = waitingTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Position getOrigin() {
        return origin;
    }

    public void setOrigin(Position origin) {
        this.origin = origin;
    }

    public Position getDestination() {
        return destination;
    }

    public void setDestination(Position destination) {
        this.destination = destination;
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(int urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int row, int column) {
        this.currentPosition.setPosition(row, column);
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }
}
