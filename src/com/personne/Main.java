package com.personne;

public class Main {

    public static void main(String[] args) {
        Personne civil = new Civil(new Courir(),new PremierSoin(),new CombatSniper());

//       Personne []personnes= {new Sniper(), new Medecin()};
//
//        for (Personne personne: personnes) {
//            personne.combattre();
//            personne.soinger();
//
//
//        }
        civil.combattre();
        civil.soinger();
        civil.setCombattre(new Pacifiste());
        civil.combattre();
    }
}
