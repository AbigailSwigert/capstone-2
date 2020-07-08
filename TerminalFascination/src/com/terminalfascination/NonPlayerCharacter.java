package com.terminalfascination;

public class NonPlayerCharacter extends Character {
    public boolean isAlive;

    private NonPlayerCharacter(String name, Species species, String textColor) {
        this.name = name;
        this.species = species;
        this.textColor = textColor;
    }

    private NonPlayerCharacter(String name, Species species, String textColor, boolean isAlive) { // Polymorphism via method overloading
        this.name = name;
        this.species = species;
        this.isAlive = isAlive;
        this.textColor = textColor;
    }

    // NPCs
    public static final NonPlayerCharacter PRINCESS_JESSICA = new NonPlayerCharacter("Princess Jessica", Species.HUMAN, PURPLE);
    public static final NonPlayerCharacter ADAMETES = new NonPlayerCharacter("Adametes", Species.URSATAUR, RED);
    public static final NonPlayerCharacter GABEL = new NonPlayerCharacter("Gabel", Species.HUMAN, YELLOW);
    public static final NonPlayerCharacter CRITION = new NonPlayerCharacter("Crition", Species.SHAPESHIFTER, GREEN);
    public static final NonPlayerCharacter AAYLEPHUR = new NonPlayerCharacter("Aaylephur", Species.MERPERSON, CYAN);
    public static final NonPlayerCharacter KEVON = new NonPlayerCharacter("Kevon", Species.HUMAN, BLUE, true);
}
