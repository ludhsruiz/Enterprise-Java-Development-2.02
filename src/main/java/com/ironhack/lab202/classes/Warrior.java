package com.ironhack.lab202.classes;

public class Warrior extends Player {

    public Warrior(String name, int health, int strength) {
        super(name, health, strength);

        int strengthIncrease = 10;
        setStrength(getStrength() + strengthIncrease);
    }

//    // NO ESTOY SEGURA A QUE SE REFIERE CON 'SPECIALIZE BEHAVIOUR'
//    ME HE PUESTO CREATIVA CON UN METODO PARA UNO Y STATE PLUS PARA EL OTRO //
}
