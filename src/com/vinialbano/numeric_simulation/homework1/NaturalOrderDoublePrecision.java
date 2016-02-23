package com.vinialbano.numeric_simulation.homework1;

/**
 * Created by: @vinialbano
 * Project: NumericSimulation
 * Date: Jan 30, 2016
 */

public class NaturalOrderDoublePrecision {

    public static double getSum(int lowerBound, int upperBound) {
        double sum = 0d;
        double denominator;
        double partialSum;

        for (int i = lowerBound; i <= upperBound; i++) {
            denominator = 3d * i * i;
            partialSum = 1d / denominator;
            sum += partialSum;
        }

        return sum;
    }
}
