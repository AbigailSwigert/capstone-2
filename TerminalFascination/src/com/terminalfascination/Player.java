package com.terminalfascination;

public class Player extends Character {
    private static Player player_instance = null;

    private Player(String name, Species species) {
        this.name = name;
        this.species = species;
        this.textColor = BLACK;
    }

    public static Player getInstance(String name, Species species) {
        if (player_instance == null) player_instance = new Player(name, species);
        return player_instance;
    }
}
