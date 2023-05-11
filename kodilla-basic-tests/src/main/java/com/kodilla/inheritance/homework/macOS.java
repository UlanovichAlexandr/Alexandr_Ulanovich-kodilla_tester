package com.kodilla.inheritance.homework;

public class macOS extends OperatingSystem {
    public macOS(int year) {
        super(year);
    }
    @Override
    public void turnOn() {
        System.out.println("Operating system macOS is turn On the 2001th year");
    }
    @Override
    public void turnOff() {
        System.out.println("Operating system macOS is turn Off the 2500th year");
    }
}