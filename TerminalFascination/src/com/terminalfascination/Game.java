package com.terminalfascination;

import java.util.Scanner;

// Abstraction
abstract class Game {

    static int playerReply;

    public static Player player = Player.getInstance(null, null);

    public static final Scanner playerInput = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        System.out.println("\nWelcome to Terminal Fascination, are you ready to start the game?\n1. Yes\n2. Not yet\nPress 0 to quit the game at anytime");
        inputLoop: while(true) {
            playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                case 2:
                    System.exit(0);
                case 1 :
                    playerIntro();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public static void playerIntro() {
        MapArea.clearScreen();
        System.out.println(Character.RESET + "-----------------Terminal Fascination-----------------");
        System.out.println(Character.RESET + "-------------------------Beta-------------------------");
        System.out.println("\nHello traveler, what is your name?");
        Game.playerInput.nextLine();
        Game.player.name = Game.playerInput.nextLine();
        System.out.println("\nHuh, " + Game.player.name + ", interesting. What species would you like to play as?\n1. Human\n2. Ursataur\n3. Merperson\n4. Shapeshifter");
        inputLoop: while(true) {
            playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    Game.player.species = Species.HUMAN;
                    break inputLoop;
                case 2:
                    Game.player.species = Species.URSATAUR;
                    break inputLoop;
                case 3:
                    Game.player.species = Species.MERPERSON;
                    break inputLoop;
                case 4:
                    Game.player.species = Species.SHAPESHIFTER;
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
        System.out.println("\n" + Game.player.name + " the " + Game.player.species.speciesName + ", this will be a fun game.\n");
        System.out.println("\nContinue?\n0. Quit game\n1. Continue");
        inputLoop: while (true) {
            playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    break inputLoop;
                default:
                    System.out.println("Invalid command, please enter 1 to continue or 0 to quit the game.");
            }
        }
        Tavern.theTavern.tavernIntro();
    };
}

