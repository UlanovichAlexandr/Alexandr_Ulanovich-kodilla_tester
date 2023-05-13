package com.kodilla.abstacts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;
    private String firstName;
    private int age;
    private String job;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public int getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public abstract void ResponsibilitiesOfJob();
}