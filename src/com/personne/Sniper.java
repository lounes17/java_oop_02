package com.personne;

public class Sniper extends Personne {
    Sniper(){
        this.espritCombatif= new CombatSniper();
        this.soin=new AucunSoin();
        this.deplacement=new Courir();
    };

    Sniper(Deplacement deplacement,Soin soin, EspritCombatif espritCombatif){
        super(deplacement,soin,espritCombatif);
    }
}
