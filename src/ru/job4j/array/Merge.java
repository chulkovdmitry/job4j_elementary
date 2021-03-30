package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int size = 0;
        int ind = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] < right[j]) {
                    rsl[size] = left[i];
                    size++;
                    break;
                } else if (left[i] >= right[j]) {
                    rsl[size] = right[j];
                    size++;
                    ind++;
                  }
            }
        }
        for (int k = ind; size < rsl.length; k++) {
            rsl[size] = right[k];
            size++;
        }
        return rsl;
    }
}
