package com.giovani.entity;

import com.giovani.structs.nonlinear.Matrix;

public class City {
    private Matrix matrix;

    public City() {
        this.matrix = new Matrix();
    }

    public void printCity() {
        matrix.printMatrix();
    }

    public Matrix getMatrix() {
        return matrix;
    }
}