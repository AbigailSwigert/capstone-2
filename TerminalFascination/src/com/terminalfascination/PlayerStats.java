package com.terminalfascination;

import java.util.HashMap;

// Abstraction
abstract class PlayerStats {

    public static final HashMap<String, Integer> allCompletedLevels = new HashMap<>();

    // Interface
    interface Processor<T, R> {
        R process(T arg);
    }

    // Lambda
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
        if(!Game.player.isAlive) {
            System.out.println("Unfortunately you were killed by " + NonPlayerCharacter.GABEL.name + "\n");
        }
        printAllAreasCompletedLevels();
        AbandonedCastle.printLoot();
    }
}
