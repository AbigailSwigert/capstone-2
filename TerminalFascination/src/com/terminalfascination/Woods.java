package com.terminalfascination;

// Inheritance
public class Woods extends MapArea {

    // Singleton
    private static Woods woods_instance = null;

    private Woods(String areaName, NonPlayerCharacter areaCompanion) {
        this.areaName = areaName;
        this.areaCompanion = areaCompanion;
    }

    public static final Woods theWoods = Woods.getInstance("The Woods", NonPlayerCharacter.ADAMETES);

    // Encapsulation
    public static Woods getInstance(String areaName, NonPlayerCharacter areaCompanion) {
        if (woods_instance == null) woods_instance = new Woods(areaName, areaCompanion);
        return woods_instance;
    }

    // Polymorphism via method overriding
    public void startLevel1() {
        clearScreen();
        System.out.println("------------------The Woods Level 1------------------");
        System.out.println("\nThis level is incomplete");
        leavePrompt();
    }

    // Polymorphism via method overriding
    public void startLevel2() {
        clearScreen();
        System.out.println("------------------The Woods Level 2------------------");
        System.out.println("\nThis level is incomplete");
        leavePrompt();
    }

    // Polymorphism via method overriding
    public void startLevel3() {
        clearScreen();
        System.out.println("------------------The Woods Level 3------------------");
        System.out.println("\nThis level is incomplete");
        leavePrompt();
    }

    // Polymorphism via method overriding
    public void startLevel4() {
        clearScreen();
        System.out.println("------------------The Woods Level 4------------------");
        System.out.println("\nThis level is incomplete");
        continueGame();
        finishStory();
    }

    // Polymorphism via method overriding
    public void finishStory() {
        clearScreen();
        System.out.println("-----------------------The End-----------------------");
        System.out.println("\nThis ending is incomplete");
        endGameChoices();
    }
}
