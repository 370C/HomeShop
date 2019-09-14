package com.cursan.paris;

public class Taxi implements moyenDeLocomotion {
    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis un taxi et je vais à l'adresse : " + adresse);
    }
}
