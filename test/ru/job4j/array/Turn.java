package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[array.length - 1 - index];
            array[array.length - 1 - index] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
