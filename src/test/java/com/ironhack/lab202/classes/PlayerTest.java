package com.ironhack.lab202.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private static Player player;


    @Test
    void loseOneLife_withLives_OneLifeLess() {
            player.loseOneLife();
            assertEquals(2, player.getLives());
            player.loseOneLife();
            assertEquals(1, player.getLives());
    }

    void loseOneLife_lastLife_heDied() {
            player.setLives(1);
            player.loseOneLife();
            assertEquals("You died", player.loseOneLife());
    }

    void loseOneLife_zeroLife_heIsAlreadyDied() {
            player.setLives(0);
            player.loseOneLife();
            assertEquals("You are already died", player.loseOneLife());
    }

    void loseOneLife_restoreLife_restored() {
            player.setLives(3);
            player.setHealth(5);
            player.loseOneLife();
            assertEquals(150, player.getHealth());
    }


    @Test
    void attack_noDie_lessHealth() {
            Player warrior1 = new Warrior("Pedro", 200, 50);
            Player warrior2 = new Warrior("Pepe", 200, 30);
            assertEquals(150, warrior1.attack(warrior2));
    }

    void attack_die_restHealthAndLessLife() {
            Player warrior1 = new Warrior("Pedro", 200, 50);
            Player warrior2 = new Warrior("Pepe", 40, 30);
            assertEquals(40, warrior1.attack(warrior2));
            assertEquals(2, warrior2.getLives());
    }


}