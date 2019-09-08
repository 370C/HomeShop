package com.cursan.miam;

public class Aliment {
    String nom;
    boolean estCuit;

    public void manger() {
        if (estCuit) {
            System.out.println("Miam mian cet aliment : " + nom + " est bien cuit");
        } else {
            System.out.println("Beeerk cet aliment : " + nom + " est cru !" );
        }
    }
}
