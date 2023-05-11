package com.kodilla.inheritance.homework;

public class OperationSystemDisplayResult {
    public static void main(String[] args) {
        Windows windows = new Windows(2500);
        windows.turnOn();
        windows.turnOff();

    macOS macOS = new macOS(2000);
    macOS.turnOn();
     macOS.turnOff();
}
}
