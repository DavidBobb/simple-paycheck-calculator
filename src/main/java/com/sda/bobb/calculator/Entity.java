package com.sda.bobb.calculator;

public abstract class Entity {

    private String city;

    public Entity() {
    }

    public Entity(String city) {

        if (city != null && !city.isEmpty()) {
            this.city = city;
        } else {
            throw new InvalidDataException("City can't be empty");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\n" + "City " + "|" + city + "|" + "\n" + " Amount received " + "|" + amountReceived() + "|" + "\n";
    }

    public abstract double amountReceived();  // metoda abstarcata nu are implementare, se poate gasi doar intr-o calasa abstarcta
}
