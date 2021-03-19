package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        // int rsl = value / 70;

        return value / 70;
    }

    public static int rubleToDollar(int value) {
        // int rsl = value / 60; /* формула перевода рублей в доллары. */
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        //int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are 2. Test result : " + passed);
        //int dollar = Converter.rubleToDollar(180);
        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}
