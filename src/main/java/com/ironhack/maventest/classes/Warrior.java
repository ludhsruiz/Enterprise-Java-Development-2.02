package com.ironhack.maventest.classes;

public class Warrior extends Player {

    int strategy;

    public Warrior(String name, int health, int strength, int lives, int Strategy) {
        super(name, health, strength, lives);
        this.strategy = strategy;
    }

    public int getStrategy() {
        return strategy;
    }

    public void setStrategy(int strategy) {
        this.strategy = strategy;
    }
}
