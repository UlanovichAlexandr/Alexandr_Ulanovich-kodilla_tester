package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Operating system Windows is turn On the 1985th year");
    }
    @Override
    public void turnOff() {
        System.out.println("Operating system Windows is turn Off the 2100th year");
    }
}

