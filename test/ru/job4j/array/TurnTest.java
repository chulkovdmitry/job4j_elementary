package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {5, 3, 2, 7, 8, 9, 1, 4, 6};
        int[] result = Turn.back(input);
        int[] expected = new int[] {6, 4, 1, 9, 8, 7, 2, 3, 5};
        Assert.assertArrayEquals(expected, result);
    }
}