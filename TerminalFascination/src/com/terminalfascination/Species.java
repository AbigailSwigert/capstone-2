package com.terminalfascination;

public class Species {
    String speciesName;

    private Species(String speciesName) {
        this.speciesName = speciesName;
    }

    public static final Species HUMAN = new Species("Human");
    public static final Species URSATAUR = new Species("Ursataur");
    public static final Species MERPERSON = new Species("Merperson");
    public static final Species SHAPESHIFTER = new Species("Shapeshifter");
    public static final Species KRYSY = new Species("Krysy"); //Czech word for rats

    public String getSpecies() {
        return this.speciesName;
    }
}
