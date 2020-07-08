package com.terminalfascination;

public class AbandonedCastle extends MapArea {
    private static AbandonedCastle abandonedCastle_instance = null;

    public AbandonedCastle(String areaName, NonPlayerCharacter areaCompanion) {
        this.areaName = areaName;
        this.areaCompanion = areaCompanion;
    }

    public static final AbandonedCastle theAbandonedCastle = AbandonedCastle.getInstance("The Abandoned Castle", NonPlayerCharacter.GABEL);

    public static AbandonedCastle getInstance(String areaName, NonPlayerCharacter areaCompanion) {
        if (abandonedCastle_instance == null) abandonedCastle_instance = new AbandonedCastle(areaName, areaCompanion);
        return abandonedCastle_instance;
    }
}
