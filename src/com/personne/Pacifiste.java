package com.personne;

public class Pacifiste implements EspritCombatif {
    @Override
    public void combat() {
        System.out.println("je ne combats pas");
    }
}
