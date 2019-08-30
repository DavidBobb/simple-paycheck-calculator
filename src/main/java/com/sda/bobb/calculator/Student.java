package com.sda.bobb.calculator;

public class Student extends Entity {

    private double scholarship;

    public Student() {
    }

    public Student(String city, float scholarship) {
        super(city);

        if (scholarship != 0) {
            this.scholarship = scholarship;
        } else {
            throw new InvalidDataException("Scholarship must be grater than 0");
        }
    }

    @Override
    public double amountReceived() {
        return scholarship;
    }
}
