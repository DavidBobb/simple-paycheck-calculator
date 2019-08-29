package com.sda.bobb.calculator;

public class Student extends Entity {

    private float scholarship;

    public Student() {
    }

    public Student(String city, float scholarship) {
        super(city);

        if (scholarship != 0) {
            this.scholarship = scholarship;
        } else {
            throw new InvalidDataException("Scholarship can't be 0");
        }
    }

    @Override
    public float amountReceived() {
        return scholarship;
    }
}
