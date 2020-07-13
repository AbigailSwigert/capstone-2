package com.terminalfascination;

// Inheritance
public class RoyalCourt extends MapArea {

    // Singleton
    private static RoyalCourt royalCourt_instance = null;

    private RoyalCourt(String areaName, NonPlayerCharacter areaCompanion) {
        this.areaName = areaName;
        this.areaCompanion = areaCompanion;
    }

    public static final RoyalCourt theCourt = RoyalCourt.getInstance("The Royal Court", NonPlayerCharacter.PRINCESS_JESSICA);

    // Encapsulation
    public static RoyalCourt getInstance(String areaName, NonPlayerCharacter areaCompanion) {
        if (royalCourt_instance == null) royalCourt_instance = new RoyalCourt(areaName, areaCompanion);
        return royalCourt_instance;
    }

    // Polymorphism via method overriding
    public void startLevel1() {
        clearScreen();
        System.out.println("---------------The Royal Court Level 1---------------");
        System.out.println("\nThis level is incomplete");
        leavePrompt();
    }

    // Polymorphism via method overriding
    public void startLevel2() {
        clearScreen();
        System.out.println("---------------The Royal Court Level 2---------------");
        System.out.println("\nThis level is incomplete");
        leavePrompt();
    }

    // Polymorphism via method overriding
    public void startLevel3() {
        clearScreen();
        System.out.println("---------------The Royal Court Level 3---------------");
        System.out.println("\nThis level is incomplete");
        leavePrompt();
    }

    // Polymorphism via method overriding
    public void startLevel4() {
        clearScreen();
        System.out.println("---------------The Royal Court Level 4---------------");
        System.out.println("\nThis level is incomplete");
        continueGame();
    }

    // Polymorphism via method overriding
    public void finishStory() {
        clearScreen();
        System.out.println("-----------------------The End-----------------------");
        System.out.println("\nThis ending is incomplete");
        endGameChoices();
    }
}
