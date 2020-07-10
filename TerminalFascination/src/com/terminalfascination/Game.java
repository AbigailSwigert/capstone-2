package com.terminalfascination;

import java.util.Scanner;

public class Game {

    public static Player player = Player.getInstance(null, null);

    public static final Scanner playerInput = new Scanner(System.in);

    public static void main(String[] args) {
        UndergroundTunnels.theUndergroundTunnels.enterArea();
    }
}

