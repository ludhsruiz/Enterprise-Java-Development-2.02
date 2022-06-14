package com.ironhack.maventest.classes;

public class Wizard extends Player{

    String spell;

    public Wizard(String name, int health, int strength, int lives, String spell) {
        super(name, health, strength, lives);
        this.spell = spell;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }
}
