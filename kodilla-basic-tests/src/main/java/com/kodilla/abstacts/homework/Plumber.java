package com.kodilla.abstacts.homework;

public class Plumber extends Job{
    public Plumber() {
        super(5000, "fix plumbing problems");
    }

    @Override
    public void ResponsibilitiesOfJob() {
        System.out.println("fix plumbing problems");
    }
}
