package com.giovani.entity;

public class Blockade extends Pointer {
    public Blockade() {
        super('B');
        this.blocked = true;
    }

    @Override
    public Vehicle process() {
        return null;
    }
}
