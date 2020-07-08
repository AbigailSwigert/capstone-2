package com.terminalfascination;

public class Tavern extends MapArea {

    private static Tavern tavern_instance = null;

    public Tavern(String areaName) {
        this.areaName = areaName;
        this.maxLevels = 1;
    }

    public static Tavern getInstance(String areaName) {
        if (tavern_instance == null) tavern_instance = new Tavern(areaName);
        return tavern_instance;
    }

    public static final Tavern theTavern = Tavern.getInstance("Tavernicity");

    public void completeLevel(){
        this.levelsCompleted += 1;
        if (this.levelsCompleted >= this.maxLevels) {
            this.finishStory();
        }
    };

    public static void nextArea(MapArea nextArea) {
        nextArea.startLevel();
    }

}
