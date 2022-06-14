package com.ironhack.lab202.classes;

public class Player {

    private String name;
    private int health;
    private int strength;
    private int lives;


    public Player(String name, int health, int strength) {
        setName(name);
        setHealth(health);
        setStrength(strength);
        setLives(3);
    }



    public String loseOneLife() {
        String message = "";
        if (getLives()>0) {
            setLives(getLives()-1);
            setHealth(health);
            message = "You lost one life";
            if (getLives()==0){
                message = "You died";
            }
        } else {
            message = "You are already died";
        }
        return message;
    }



    public int attack (Player player){
        int attackValue = getStrength();
        player.setHealth(player.getHealth()-attackValue);
        player.checkHealth();
        return player.getHealth();
    }

    public void checkHealth(){
        int lifeStatus = getHealth();
        if (lifeStatus <= 0){
            this.loseOneLife();
        }
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
