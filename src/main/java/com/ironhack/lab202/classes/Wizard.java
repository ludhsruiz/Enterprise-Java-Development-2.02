package com.ironhack.lab202.classes;

public class Wizard extends Player {

    public Wizard(String name, int health, int strength) {
        super(name, health, strength);
    }

    public void spell() {
        Boolean used = false;
        if (used == false) {
            setStrength(getStrength()+5);
            used = true;
        }
    }

    // NO ESTOY SEGURA A QUE SE REFIERE CON 'SPECIALIZE BEHAVIOUR'
//    ME HE PUESTO CREATIVA CON UN METODO PARA UNO Y STATE PLUS PARA EL OTRO //
}
