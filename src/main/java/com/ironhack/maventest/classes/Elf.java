package com.ironhack.maventest.classes;

public class Elf extends Player{

    int coins;

    public Elf(String name, int health, int strength, int lives, int coins) {
        super(name, health, strength, lives);
        this.coins = coins;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
