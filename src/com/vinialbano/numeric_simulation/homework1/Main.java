package com.vinialbano.numeric_simulation.homework1;

/**
 * Created by: @vinialbano.
 * Project: NumericSimulation
 * Date: Jan 30, 2016
 */

public class Main {

    final static int LOWER_BOUND = 1;
    final static int UPPER_BOUND = 1000000;

    public static void main(String[] args) {

        System.out.println("Natural Single [" + LOWER_BOUND + "," + UPPER_BOUND + "]: " + NaturalOrderSinglePrecision.getSum(LOWER_BOUND, UPPER_BOUND));
        System.out.println("Reverse Single [" + LOWER_BOUND + "," + UPPER_BOUND + "]: " + ReverseOrderSinglePrecision.getSum(LOWER_BOUND, UPPER_BOUND));
        System.out.println("Natural Double [" + LOWER_BOUND + "," + UPPER_BOUND + "]: " + NaturalOrderDoublePrecision.getSum(LOWER_BOUND, UPPER_BOUND));
        System.out.println("Reverse Double [" + LOWER_BOUND + "," + UPPER_BOUND + "]: " + ReverseOrderDoublePrecision.getSum(LOWER_BOUND, UPPER_BOUND));
    }
}
