package com.giovani.structs.nonlinear;

import com.giovani.entity.Blockade;
import com.giovani.entity.Intersection;
import com.giovani.entity.Pointer;
import com.giovani.entity.TrafficLight;
import com.giovani.extras.Utilities;

import java.util.ArrayList;

public class Matrix {
    private static final float TRAFFIC_LIGHT_PERCENTAGE = 0.25f;
    private static final float BLOCK_PERCENTAGE = 0.15f;
    private int numberOfTrafficLights = 0;
    private int numberOfBlockades = 0;
    private ArrayList<ArrayList<Pointer>> matrix;

    public Matrix() {
        this.matrix = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < 10; i++) {
            ArrayList<Pointer> pointers = new ArrayList<>();
            for (int j = 0; j < 15; j++) {
                pointers.add(new Intersection());
            }
            matrix.add(pointers);
        }
    }

    public Pointer getIntersection(int row, int column) {
        if (row < 0 || row >= matrix.size()) return null;
        if (column < 0 || column >= matrix.get(row).size()) return null;
        return matrix.get(row).get(column);
    }

    public void printMatrix() {
        printHeader();
        int i = 0, j;
        for (ArrayList<Pointer> pointers : matrix) {
            j = 0;
            printIdColumn(i + 65);
            for (Pointer pointer : pointers) {
                Utilities.printCharColor(pointer.getSymbol());
                if (j == pointers.size() - 1) continue;
                System.out.print("---");
                j++;
            }
            System.out.println(" ");
            if (i < matrix.size() - 1) {
                for (int k = 0; k < pointers.size(); k++) {
                    System.out.print("   :");
                }
            }
            System.out.println(" ");
            i++;
        }
        System.out.println(" ");
    }

    private void printHeader() {
        System.out.print("  |");
        for (int i = 0; i < matrix.getFirst().size(); i++) {
            Utilities.printStringInPurple(String.valueOf(i + 1));
            System.out.print(((i + 1 > 8) ? "| " : " | "));
        }
        System.out.println(" ");
    }

    private void printIdColumn(int i) {
        char c = (char) i;
        Utilities.printStringInCyan(c + ""); //print IdColumns
        System.out.print("[ ");

    }

    public void createObstructions() {
        int trafficLights = Math
                .max(
                        (int) (matrix.getFirst().size() * matrix.size() * TRAFFIC_LIGHT_PERCENTAGE)
                        , numberOfTrafficLights);
        int blockades = Math
                .max(
                        (int) (matrix.getFirst().size() * matrix.size() * BLOCK_PERCENTAGE)
                        , numberOfBlockades);
        for (int i = 0; i < trafficLights; i++) {
            int row = (int) (Math.random() * matrix.size());
            int column = (int) (Math.random() * matrix.get(row).size());
            if (matrix.get(row).get(column) instanceof Intersection intersection) {
                if (intersection.getQueueManager().getSize() > 0) {
                    continue;
                }
                matrix.get(row).set(column, new TrafficLight('G'));
                numberOfTrafficLights++;
            }
        }
        for (int i = 0; i < blockades; i++) {
            int row = (int) (Math.random() * matrix.size());
            int column = (int) (Math.random() * matrix.get(row).size());
            if (matrix.get(row).get(column) instanceof Intersection intersection) {
                if (intersection.getQueueManager().getSize() > 0) {
                    continue;
                }
                matrix.get(row).set(column, new Blockade());
                numberOfBlockades++;
            }
        }
    }

    public ArrayList<ArrayList<Pointer>> getMatrix() {
        return matrix;
    }

    public void setMatrix(ArrayList<ArrayList<Pointer>> matrix) {
        this.matrix = matrix;
    }

    public int getNumberOfTrafficLights() {
        return numberOfTrafficLights;
    }

    public int getNumberOfBlockades() {
        return numberOfBlockades;
    }
}