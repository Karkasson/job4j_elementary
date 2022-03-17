package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRubles(int value) {
        return value * 70;
    }

    public static int dollarToRubles(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + expected + " euro. Test result: " + passed);
        in = 360;
        expected = 6;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("360 rubles are " + expected + " dollar. Test result: " + passed);
        in = 15;
        expected = 1050;
        out = Converter.euroToRubles(in);
        passed = expected == out;
        System.out.println("15 euro are " + expected + " rubles. Test result: " + passed);
        in = 35;
        expected = 2100;
        out = Converter.dollarToRubles(in);
        passed = expected == out;
        System.out.println("35 dollar are " + expected + " rubles. Test result : " + passed);
    }
}
