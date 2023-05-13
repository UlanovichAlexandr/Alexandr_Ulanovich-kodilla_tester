package com.kodilla.abstacts.homework;

public class Welder extends Job{
    public Welder() {
        super(6000, "welding stainless steel");
    }

    @Override
    public void ResponsibilitiesOfJob() {
        System.out.println("welding stainless steel");
    }
}
