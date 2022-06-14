package com.ironhack.maventest.classes;

public class Player {

    String name ;
    int health;
    int strength;
    int lives;

    public Player(String name, int health, int strength, int lives) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}

//    I. Employing TDD, create a method that decrements the lives of a player. The method should reduce the number of
//    lives by one and restore the player’s health to its original state.

//    II. Employing TDD, create a method that allows one player to attack another. When a player attacks another,
//    the attacked player’s health should decrease by the attacking player’s strength. For example, if a playerA has
//    strength = 5 and a playerB has health = 20, then when the playerA attacks the playerB, the playerB's new
//    health will be 15. Hint: the attack method will take a Player object as an argument.