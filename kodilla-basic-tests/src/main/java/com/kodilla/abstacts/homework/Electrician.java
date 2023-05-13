package com.kodilla.abstacts.homework;

public class Electrician extends Job{
    public Electrician() {
        super(4000, "fix electrical problems");
    }

    @Override
    public void ResponsibilitiesOfJob() {
        System.out.println("fix electrical problems");
    }
}
