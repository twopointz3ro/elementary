package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 100;
        return result;
    }

    public static float euroToRuble(float value) {
        float result = value * 100;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 90;
        return result;
    }

    public static float dollarToRuble(float value) {
        float result = value * 90;
        return result;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(560);
        float ruble1 = euroToRuble(250);
        float ruble2 = dollarToRuble(300);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("560 rubles are " + dollar + " dollar");
        System.out.println("250 euro are " + ruble1 + " ruble");
        System.out.println("300 rubles are " + ruble2 + " ruble");
    }
}

