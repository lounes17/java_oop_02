package com.personne;

abstract public  class Personne {
    Deplacement deplacement=new Marcher();
    Soin soin = new AucunSoin();
    EspritCombatif espritCombatif = new Pacifiste();
    Personne(Deplacement deplacement,Soin soin, EspritCombatif espritCombatif){
        this.espritCombatif=espritCombatif;
        this.soin=soin;
        this.deplacement=deplacement;
    }
    Personne(){}

    protected void seDeplacer(){
        deplacement.deplacer();
    }
    protected void soinger(){
        soin.soinger();
    }
    protected void combattre(){
        espritCombatif.combat();
    }

    protected Deplacement setDeplacer(Deplacement deplacer){
        return this.deplacement=deplacer;
    }
    protected Soin setSoinger(Soin soinger ){
        return this.soin=soinger;
    }
    protected EspritCombatif setCombattre(EspritCombatif combatter){
        return  this.espritCombatif=combatter;
    }



}
