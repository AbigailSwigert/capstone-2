package com.terminalfascination;

public class Woods extends MapArea {
    private static Woods woods_instance = null;

    public Woods(String areaName, NonPlayerCharacter areaCompanion) {
        this.areaName = areaName;
        this.areaCompanion = areaCompanion;
    }

    public static final Woods theWoods = Woods.getInstance("The Woods", NonPlayerCharacter.ADAMETES);

    public static Woods getInstance(String areaName, NonPlayerCharacter areaCompanion) {
        if (woods_instance == null) woods_instance = new Woods(areaName, areaCompanion);
        return woods_instance;
    }
}
