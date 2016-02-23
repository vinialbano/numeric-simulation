package com.vinialbano.numeric_simulation.homework1;

/**
 * Created by: @vinialbano.
 * Project: NumericSimulation
 * Date: Jan 30, 2016
 */

public class NaturalOrderSinglePrecision {

    public static float getSum(int lowerBound, int upperBound) {
        float sum = 0f;
        float denominator;
        float partialSum;

        for (int i = lowerBound; i <= upperBound; i++) {
            denominator = 3f * i * i;
            partialSum = 1f / denominator;
            sum += partialSum;
        }

        return sum;
    }
}