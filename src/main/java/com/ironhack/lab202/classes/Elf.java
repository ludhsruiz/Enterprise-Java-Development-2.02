package com.ironhack.lab202.classes;

public class Elf extends Player{

        public Elf(String name, int health, int strength) {
            super(name, health, strength);
        }

        public void goldenCoins() {
            Boolean used = false;
            if (used == false) {
                setHealth(getHealth()+10);
                used = true;
            }
        }

    // NO ESTOY SEGURA A QUE SE REFIERE CON 'SPECIALIZE BEHAVIOUR'
//    ME HE PUESTO CREATIVA CON UN METODO PARA DOS Y STATE PLUS PARA EL OTRO //
}

