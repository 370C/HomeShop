package com.cursan.homeshop;

public class Television extends Product {
    private int size;
    private String slapType;

    public Television(String name, String description, double price) {
        super(name, description, price);
    }

    public int getSize() {
        return size;
    }

    public String getSlapType() {
        return slapType;
    }
}

