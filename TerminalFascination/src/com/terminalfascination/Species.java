package com.terminalfascination;

public class Species {
    String speciesName;

    private Species(String speciesName) {
        this.speciesName = speciesName;
    }

    public static final Species HUMAN = new Species("human");
    public static final Species URSATAUR = new Species("ursataur");
    public static final Species MERPERSON = new Species("merperson");
    public static final Species SHAPESHIFTER = new Species("shapeshifter");
    public static final Species KRYSY = new Species("krysy"); //Czech word for rats

    public String getSpecies() {
        return this.speciesName;
    }
}
