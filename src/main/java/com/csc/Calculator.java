package com.csc;

import java.util.Arrays;

public class Calculator {

    public static int[] squareNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                     .map(n -> n * n)
                     .toArray();
    }

    public static int[] filterOutOdds(int[] numbers) {
        return Arrays.stream(numbers)
                     .filter(n -> n % 2 == 0)
                     .toArray();
    }

    public static int[] filterOutEvens(int[] numbers) {
        return Arrays.stream(numbers)
                     .filter(n -> n % 2 != 0)
                     .toArray();
    }

    public static int findMinimum(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double calculateAverage(int[] numbers) {
        return (double) calculateSum(numbers) / numbers.length;
    }

    public static int findMinimumStream(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }

    public static int findMaximumStream(int[] numbers) {
        return Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
    }

    public static int calculateSumStream(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    public static double calculateAverageStream(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0.0);
    }
}
