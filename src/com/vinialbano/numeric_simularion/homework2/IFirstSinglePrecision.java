package com.vinialbano.numeric_simularion.homework2;

/**
 * Created by: @vinialbano.
 * Project: NumericSimulation
 * Date: Feb 09, 2016
 */

public class IFirstSinglePrecision {

    public static float[][] multiplyMatrixes(float[][] matrixA, float[][] matrixB, int size) {
        float newMatrix[][] = new float[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                newMatrix[i][j] = matrixA[i][j] * matrixB[i][j];
            }
        }

        return newMatrix;
    }
}
