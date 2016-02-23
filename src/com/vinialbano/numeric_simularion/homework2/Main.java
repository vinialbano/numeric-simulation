package com.vinialbano.numeric_simularion.homework2;

import java.util.Random;

/**
 * Created by: @vinialbano.
 * Project: NumericSimulation
 * Date: Feb 09, 2016
 */

public class Main {

    final static int DIMENSION = 10000;
    final static int LOOP = 10;

    public static void main(String[] args) {

        long initialTime, finalTime;
        float[][] matrixA, matrixB;
        double[][] matrixC, matrixD;

        Random rand = new Random();

        matrixA = new float[DIMENSION][DIMENSION];
        matrixB = new float[DIMENSION][DIMENSION];
        matrixC = null;
        matrixD = null;

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                matrixA[i][j] = rand.nextFloat();
                matrixB[i][j] = rand.nextFloat();
            }
        }

        System.out.println("Dimension: " + DIMENSION);

        System.out.println("\nI First Single Precision");
        for (int i = 0; i < LOOP; i++) {

            initialTime = System.nanoTime();
            IFirstSinglePrecision.multiplyMatrixes(matrixA, matrixB, DIMENSION);
            finalTime = System.nanoTime();

            System.out.println(finalTime - initialTime);
        }

        System.out.println("\nJ First Single Precision");
        for (int i = 0; i < LOOP; i++) {

            initialTime = System.nanoTime();
            JFirstSinglePrecision.multiplyMatrixes(matrixA, matrixB, DIMENSION);
            finalTime = System.nanoTime();

            System.out.println(finalTime - initialTime);
        }

        matrixA = null;
        matrixB = null;
        matrixC = new double[DIMENSION][DIMENSION];
        matrixD = new double[DIMENSION][DIMENSION];

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                matrixC[i][j] = rand.nextDouble();
                matrixD[i][j] = rand.nextDouble();
            }
        }

        System.out.println("\nI First Double Precision");
        for (int i = 0; i < LOOP; i++) {

            initialTime = System.nanoTime();
            IFirstDoublePrecision.multiplyMatrixes(matrixC, matrixD, DIMENSION);
            finalTime = System.nanoTime();

            System.out.println(finalTime - initialTime);
        }

        System.out.println("\nJ First Double Precision");
        for (int i = 0; i < LOOP; i++) {

            initialTime = System.nanoTime();
            JFirstDoublePrecision.multiplyMatrixes(matrixC, matrixD, DIMENSION);
            finalTime = System.nanoTime();

            System.out.println(finalTime - initialTime);
        }
    }
}
