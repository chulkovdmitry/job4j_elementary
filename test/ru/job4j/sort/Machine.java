package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int ost = money - price;
        for (int i = 0; i < coins.length; i++) {
         if (ost == 0) {
             break;
         }
         while (ost >= coins[i]) {
          ost = ost - coins[i];
          rsl[size] = coins[i];
          size++;
         }
        }
        return Arrays.copyOf(rsl, size);
    }
}
