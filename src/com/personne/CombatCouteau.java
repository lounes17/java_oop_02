package com.personne;

public class CombatCouteau implements EspritCombatif {
    @Override
    public void combat() {
        System.out.println("Je me combats avec un coutau");
    }
}
