package com.vinialbano.numeric_simularion.homework2;

/**
 * Created by: @vinialbano.
 * Project: NumericSimulation
 * Date: Feb 09, 2016
 */

public class JFirstDoublePrecision {

    public static double[][] multiplyMatrixes(double[][] matrixA, double[][] matrixB, int size) {
        double newMatrix[][] = new double[size][size];

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                newMatrix[i][j] = matrixA[i][j] * matrixB[i][j];
            }
        }

        return newMatrix;
    }
}
