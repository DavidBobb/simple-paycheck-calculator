package com.sda.bobb.calculator;

public class Professor extends Entity {

    private float salary;

    public Professor() {
    }

    public Professor(String city, float salary) {
        super(city);

        if (salary != 0) {
            this.salary = salary;
        } else {
            throw new InvalidDataException("Salary can't be 0");
        }
    }

    @Override
    public float amountReceived() {
        return salary;
    }
}
