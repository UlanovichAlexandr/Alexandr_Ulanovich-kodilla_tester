package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator1 = new Calculator();
        int c = 10;
        int d = 8;
        int subResult = calculator1.sub(c, d);
        boolean korrect = ResultChecker.assertEquals(2, subResult);
        if (korrect) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + c + " i " + d);
        }
    }
}
