package com.cursan.paris;

public class Bus implements moyenDeLocomotion {
    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis un bus et je vais à l'adresse : " + adresse);
    }
}
