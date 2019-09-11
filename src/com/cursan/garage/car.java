package com.cursan.garage;

import java.util.ArrayList;
import java.util.List;

public class car extends Vehicle {
    private int door;
    private int litrePer100km;
    private  String motor;
    private List<String> options = new ArrayList<String>();

    public car(String modelName, String description, String manufacturer, int year, String color, int[] dimension, int weight, int door, int litrePer100km, String motor, List<String> options) {
        super(modelName, description, manufacturer, year, color, dimension, weight);
        this.door = door;
        this.litrePer100km = litrePer100km;
        this.motor = motor;
        this.options = options;
    }

    public void starHeadlight() {
        System.out.println("J'allume mes phares");
    }

    public void openTrunk() {
        System.out.println("J'ouvre mon coffre");
    }

    public int getDoor() {
        return door;
    }

    public int getLitrePer100km() {
        return litrePer100km;
    }

    public String getMotor() {
        return motor;
    }

    public List<String> getOptions() {
        return options;
    }
}
