package ru.job4j.array;

public class Defragment {
        public static String[] compress(String[] array) {
            int point; /* указатель на null ячейку. */
            for (int index = 0; index < array.length; index++) {
                if (array[index] == null) {
                    point = index;
                    for (int ind = point; ind < array.length; ind++) {
                        if (array[ind] != null) {
                          array[point] = array[ind];
                          array[ind] = null;
                          break;
                        }
                    }
                }
                System.out.print(array[index] + " ");
            }
            return array;
        }

        public static void main(String[] args) {
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int index = 0; index < compressed.length; index++) {
                System.out.print(compressed[index] + " ");
            }
        }
}
