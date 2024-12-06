package com.csc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    @Test
    public void testSquareNumbers() {
        int[] numbers = {1, 2, 3, 4};
        int[] expected = {1, 4, 9, 16};
        assertArrayEquals(expected, Calculator.squareNumbers(numbers));
    }

    @Test
    public void testEmptyArray() {
        int[] numbers = {};
        int[] expected = {};
        assertArrayEquals(expected, Calculator.squareNumbers(numbers));
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] numbers = {-1, -2, -3, -4};
        int[] expected = {1, 4, 9, 16};
        assertArrayEquals(expected, Calculator.squareNumbers(numbers));
    }

    @Test
    public void testArrayWithZeros() {
        int[] numbers = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, Calculator.squareNumbers(numbers));
    }

    @Test
    public void testArrayWithLargeNumbers() {
        int[] numbers = {1000, 2000, 3000};
        int[] expected = {1000000, 4000000, 9000000};
        assertArrayEquals(expected, Calculator.squareNumbers(numbers));
    }

    @Test
    public void testFilterOutOdds() {
        int[] numbers = {3, 5, 1, 4, 2};
        int[] expected = {4, 2};
        assertArrayEquals(expected, Calculator.filterOutOdds(numbers));
    }

    @Test
    public void testFilterOutEvens() {
        int[] numbers = {3, 5, 1, 4, 2};
        int[] expected = {3, 5, 1};
        assertArrayEquals(expected, Calculator.filterOutEvens(numbers));
    }

    @Test
    public void testEmptyArrayForFilter() {
        int[] numbers = {};
        int[] expected = {};
        assertArrayEquals(expected, Calculator.filterOutOdds(numbers));
        assertArrayEquals(expected, Calculator.filterOutEvens(numbers));
    }

    @Test
    public void testArrayWithOnlyOdds() {
        int[] numbers = {1, 3, 5, 7};
        int[] expected = {};
        assertArrayEquals(expected, Calculator.filterOutOdds(numbers));
        assertArrayEquals(numbers, Calculator.filterOutEvens(numbers));
    }

    @Test
    public void testArrayWithOnlyEvens() {
        int[] numbers = {2, 4, 6, 8};
        int[] expected = {};
        assertArrayEquals(expected, Calculator.filterOutEvens(numbers));
        assertArrayEquals(numbers, Calculator.filterOutOdds(numbers));
    }

    @Test
    public void testFindMinimum() {
        int[] numbers = {3, 5, 1, 4, 2};
        assertEquals(1, Calculator.findMinimum(numbers));
    }

    @Test
    public void testFindMaximum() {
        int[] numbers = {3, 5, 1, 4, 2};
        assertEquals(5, Calculator.findMaximum(numbers));
    }

    @Test
    public void testCalculateSum() {
        int[] numbers = {3, 5, 1, 4, 2};
        assertEquals(15, Calculator.calculateSum(numbers));
    }

    @Test
    public void testCalculateAverage() {
        int[] numbers = {3, 5, 1, 4, 2};
        assertEquals(3.0, Calculator.calculateAverage(numbers));
    }

    @Test
    public void testFindMinimumStream() {
        int[] numbers = {3, 5, 1, 4, 2};
        assertEquals(1, Calculator.findMinimumStream(numbers));
    }

    @Test
    public void testFindMaximumStream() {
        int[] numbers = {3, 5, 1, 4, 2};
        assertEquals(5, Calculator.findMaximumStream(numbers));
    }

    @Test
    public void testCalculateSumStream() {
        int[] numbers = {3, 5, 1, 4, 2};
        assertEquals(15, Calculator.calculateSumStream(numbers));
    }

    @Test
    public void testCalculateAverageStream() {
        int[] numbers = {3, 5, 1, 4, 2};
        assertEquals(3.0, Calculator.calculateAverageStream(numbers));
    }
}
