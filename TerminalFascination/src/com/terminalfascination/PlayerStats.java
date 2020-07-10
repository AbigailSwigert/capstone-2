package com.terminalfascination;

import java.util.HashMap;

abstract class PlayerStats {

    public static final HashMap<String, Integer> allCompletedLevels = new HashMap<>();

    interface Processor<T, R> {
        R process(T arg);
    }

    private static final Processor<HashMap<String, Integer>, Integer> totalLevels = (allCompletedLevels) -> {
        int sum = 0;
        for(Integer i: allCompletedLevels.values()){
            sum += i;
        }
        return sum;
    };

    private static void printAllAreasCompletedLevels() {
        for (String area: allCompletedLevels.keySet()){
            System.out.println(area + " levels completed: " + allCompletedLevels.get(area));
        }
    }

    public static void printPlayerStats() {
        MapArea.clearScreen();
        System.out.println(Character.RESET + "\n---------------------Player Stats---------------------");
        System.out.println("\nCongratulations " + Game.player.name + ", you completed " + totalLevels.process(allCompletedLevels) + " levels of Terminal Fascination!\n");
        printAllAreasCompletedLevels();
    }
}
