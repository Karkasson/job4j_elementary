package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int euroToRubles(int value) {
        int rsl = value * 70;
        return  rsl;
    }

    public static int dollarToRubles(int value) {
        int rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(360);
        System.out.println("360 rubles are " + dollar + " dollar.");
        int rubles = Converter.euroToRubles(15);
        System.out.println("15 euro are " + rubles + " rubles.");
        int rubles1 = Converter.dollarToRubles(35);
        System.out.println("35 dollar are " + rubles1 + " rubles.");
    }
}
