package com.terminalfascination;

// Inheritance
public class Player extends Character {

    // Singleton
    private static Player player_instance = null;

    private Player(String name, Species species) {
        this.name = name;
        this.species = species;
        this.textColor = WHITE;
        this.isAlive = true;
    }

    // Encapsulation
    public static Player getInstance(String name, Species species) {
        if (player_instance == null) player_instance = new Player(name, species);
        return player_instance;
    }
}
