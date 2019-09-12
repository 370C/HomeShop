package com.cursan.garage;

public class Bike extends Vehicle {
    public Bike(String modelName, String description, String manufacturer, int year, String color, int[] dimension, int weight) {
        super(modelName, description, manufacturer, year, color, dimension, weight);
    }

    public Bike() {
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
