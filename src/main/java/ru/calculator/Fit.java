package ru.calculator;

public class Fit {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short heightMan = 194;
        short heightWoman = 170;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man 194 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}

