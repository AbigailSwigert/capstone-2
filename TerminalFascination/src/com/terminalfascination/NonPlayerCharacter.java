package com.terminalfascination;

public class NonPlayerCharacter extends Character {
    public boolean isAlive;

    private NonPlayerCharacter(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    private NonPlayerCharacter(String name, Species species, boolean isAlive) { // Polymorphism via method overloading
        this.name = name;
        this.species = species;
        this.isAlive = isAlive;
    }

    public static final NonPlayerCharacter PRINCESS_JESSICA = new NonPlayerCharacter("Princess Jessica", Species.HUMAN);
    public static final NonPlayerCharacter ADAMETES = new NonPlayerCharacter("Adametes", Species.URSATAUR);
    public static final NonPlayerCharacter GABEL = new NonPlayerCharacter("Gabel", Species.HUMAN);
    public static final NonPlayerCharacter CRITION = new NonPlayerCharacter("Crition", Species.SHAPESHIFTER);
    public static final NonPlayerCharacter AAYLEPHUR = new NonPlayerCharacter("Aaylephur", Species.MERPERSON);
    public static final NonPlayerCharacter KEVON = new NonPlayerCharacter("Kevon", Species.HUMAN, true);
}
