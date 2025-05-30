package com.giovani.entity;

import com.giovani.structs.linear.QueueManager;

public class Intersection extends Pointer {
    private QueueManager queueManager;
    private int countProcessed;

    public Intersection() {
        super('.');
        this.queueManager = new QueueManager();
        this.countProcessed = 0;
        this.blocked = false;
    }

    @Override
    public Vehicle process() {
        return getVehicle();
    }

    @Override
    public char getSymbol() {
        if (this.queueManager.getSize() > 0) {
            return 'C';
        }
        return '*';
    }

    public void addVehicle(Vehicle vehicle) {
        this.queueManager.add(vehicle);
        countProcessed++;
    }

    protected Vehicle getVehicle() {
        return this.queueManager.poll();
    }

    public QueueManager getQueueManager() {
        return queueManager;
    }

    public void setQueueManager(QueueManager queueManager) {
        this.queueManager = queueManager;
    }

    public int getCountProcessed() {
        return countProcessed;
    }

    public void setCountProcessed(int countProcessed) {
        this.countProcessed = countProcessed;
    }
}
