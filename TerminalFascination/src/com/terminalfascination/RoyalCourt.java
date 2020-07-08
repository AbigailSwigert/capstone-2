package com.terminalfascination;

public class RoyalCourt extends MapArea {
    private static RoyalCourt royalCourt_instance = null;

    public RoyalCourt(String areaName, NonPlayerCharacter areaCompanion) {
        this.areaName = areaName;
        this.areaCompanion = areaCompanion;
    }


    public static final RoyalCourt theCourt = RoyalCourt.getInstance("The Royal Court", NonPlayerCharacter.PRINCESS_JESSICA);

    public static RoyalCourt getInstance(String areaName, NonPlayerCharacter areaCompanion) {
        if (royalCourt_instance == null) royalCourt_instance = new RoyalCourt(areaName, areaCompanion);
        return royalCourt_instance;
    }
}
