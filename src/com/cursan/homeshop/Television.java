package com.cursan.homeshop;

public class Television extends Product {
    private int size;
    private String slapType;

    public Television(String name, String description, double price, int size, String slapType) {
        super(name, description, price);
        this.size = size;
        this.slapType = slapType;
    }

    public int getSize() {
        return size;
    }

    public String getSlapType() {
        return slapType;
    }
}

