package com.kodilla.basic_assertion;

import java.util.concurrent.Callable;

public class Application2 {
public static void main(String [] args){
 Calculator calculator = new Calculator();
double k = 4.5;
double l = 2.5;
double result = calculator.Math.pow(k,l);
boolean correct = ResultChecker2.assertEquals(42.95, result);
if (correct){
    System.out.println("Metoda Mathpow działa poprawnie dla liczb " + k + " i " + l);
}
else {
    System.out.println("Metoda Mathpow nie działa poprawnie dla liczb " + k + " i " + l);
}
}

        }

