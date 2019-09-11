package com.cursan.garage;

public class Vehicle {
    private String modelName;
    private String description;
    private String manufacturer;
    private int year;
    private String color;
    private int[] dimension = new int[3];
    private int weight;

    public Vehicle(String modelName, String description, String manufacturer, int year, String color, int[] dimension, int weight) {
        this.modelName = modelName;
        this.description = description;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.dimension = dimension;
        this.weight = weight;
    }

    public void start() {
        System.out.println("je suis " + modelName + " et je démarre");
    }

    public  void stop() {
        System.out.println("je suis " + modelName + " et je m'arrête");
    }

    public String getModelName() {
        return modelName;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int[] getDimension() {
        return dimension;
    }

    public int getWeight() {
        return weight;
    }
}
