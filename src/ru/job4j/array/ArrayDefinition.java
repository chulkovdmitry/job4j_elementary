package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "James Hetfield";
        names[1] = "Lars Ulrich";
        names[2] = "Kirk Hammett";
        names[3] = "Jason Newsted";
        for (int i = 0; i < 4; i++) {
            System.out.println("Участник группы № " + (i + 1) + " : " + names[i]);
        }
    }
}
