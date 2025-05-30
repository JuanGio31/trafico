package com.giovani.entity;

abstract public class Pointer {
    protected char symbol;
    protected boolean blocked;

    public Pointer(char symbol) {
        this.symbol = symbol;
        //si blocked = true, no se puede entrar al punto, esta bloqueado
        this.blocked = true;
    }

    public abstract Vehicle process();

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
