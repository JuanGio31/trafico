package com.giovani.entity;

import com.giovani.structs.linear.QueueManager;

public class Intersection {
    private char symbol;
    private String name;
    private QueueManager queueManager;

    private int vehiclesCount;

    public Intersection(char symbol) {
        this.symbol = symbol;
        this.name = "";
        this.queueManager = new QueueManager();
        this.vehiclesCount = 0;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVehiclesCount() {
        return vehiclesCount;
    }

    public void setVehiclesCount(int vehiclesCount) {
        this.vehiclesCount = vehiclesCount;
    }
}
