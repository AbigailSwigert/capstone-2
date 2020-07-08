package com.terminalfascination;

public class UndergroundTunnels extends MapArea {
    private static UndergroundTunnels undergroundTunnels_instance = null;

    public UndergroundTunnels(String areaName, NonPlayerCharacter areaCompanion) {
        this.areaName = areaName;
        this.areaCompanion = areaCompanion;
    }


    public static final UndergroundTunnels theUndergroundTunnels = UndergroundTunnels.getInstance("The Underground Tunnels", NonPlayerCharacter.CRITION);

    public static UndergroundTunnels getInstance(String areaName, NonPlayerCharacter areaCompanion) {
        if (undergroundTunnels_instance == null) undergroundTunnels_instance = new UndergroundTunnels(areaName, areaCompanion);
        return undergroundTunnels_instance;
    }
}
