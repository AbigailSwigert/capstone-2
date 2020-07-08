package com.terminalfascination;

public class Player extends Character {
    private static Player player_instance = null;

    private Player(String name) {
        this.name = name;
    }

    public static Player getInstance(String name) {
        if (player_instance == null) player_instance = new Player(name);
        return player_instance;
    }
}
