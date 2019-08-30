package com.sda.bobb.calculator;

public class Professor extends Entity {

    private double salary;

    public Professor() {
    }

    public Professor(String city, float salary) {
        super(city);

        if (salary != 0) {
            this.salary = salary;
        } else {
            throw new InvalidDataException("Salary must be grater than 0");
        }
    }

    @Override
    public double amountReceived() {
        return salary;
    }
}
