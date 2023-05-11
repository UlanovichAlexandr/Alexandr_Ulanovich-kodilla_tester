package com.kodilla.inheritance.homework;

public class OperatingSystem {


    public void turnOn () {
            System.out.println("Operating system is turn On the 1000th year");
        }


        public void turnOff () {
                System.out.println("Operating system is turn Off the 1500th year");
    }
    private int year;

    public OperatingSystem ( int year) {
            this.year = year;
        }

    public int getYear() {
        return year;
    }
}