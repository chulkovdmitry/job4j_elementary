package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 7, 9, 1, 4, 6};
        int temp = 0;
        for (int i = 0; i < array.length - 2; i++) {
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index + 1];
                    array[index + 1] = array[index];
                    array[index] = temp;
                }
            }
        }
        for (int number : array) {
            System.out.println(number);
        }
 //       for (int index = 0; index < array.length; index++) {
 //           System.out.println(array[index]);
 //       }
    }
}