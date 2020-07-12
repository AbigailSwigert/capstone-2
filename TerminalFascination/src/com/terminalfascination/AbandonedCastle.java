package com.terminalfascination;

import java.util.ArrayList;
import java.util.Arrays;

public class AbandonedCastle extends MapArea {

    private static final ArrayList<String> loot = new ArrayList<>();

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

    public static void printLoot() {
        System.out.println("Loot acquired:");
        if (loot.size() > 0) {
            loot.stream().forEach(System.out::println);
        } else {
            System.out.println("None");
        }
    }

    public void startLevel1() {
        clearScreen();
        System.out.println("--------------Abandoned Castle Level 1---------------");
        System.out.println("\nYou make your way to the lake, your back to " + Tavern.theTavern.areaName + ". Just ahead of you is a short dock with a single row boat tied to the end, as if someone put it there for you. Though it's more likely that someone put it there for themselves, and you're just considering stealing it...");
        inputLoop: while (true) {
            System.out.println("\n1. Steal the boat\n2. Walk around the lake");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("\nYou decide to steal the boat, and hope it doesn't have too large an effect on your karma. As you paddle across the lake you begin to notice movement and bright colors under the surface. Looking around your boat, you manage to spot a few Merfolk swimming around you. You lock eyes with a few wondering why they're all watching you. Oh no, do they know you stole the boat? Is it one of their boats? Fear starts to set in as you realize that the Merfolk are carnivores." );
                    System.out.println("\nYou start to paddle faster just hoping to make it to the shore unscathed. You quickly reach the shore and hop out of the boat feeling relieved. Turning slowly, you check the lake behind you to see if the Merfolk are still watching. To your surprise, the lake is calm and still and seems empty, as if you made up the entire boat ride. The sun is beginning to set now, so you turn towards the castle ready to make your way inside.");
                    break inputLoop;
                case 2:
                    System.out.println("\nYou decide to take the long way around, and avoid the bad karma that comes from stealing a boat. As you make your way around the lake, the sun begins to set and you start to worry about what may be lurking in the woods nearby. Soon you begin to hear splashing coming from the center of the lake. You stop to see what could possibly be causing the commotion and spot a group of Merfolk dancing through the water. Something about the sight is both beautiful and terrifying, it sends shivers down your spine. You continue to make your way around the lake, convinced that the sounds of their splashing are getting closer. Suddenly all goes silent.");
                    System.out.println("\nYou stop dead in your tracks and turn back towards the lake, but you can't see the dancing Merfolk anymore. Before you can even think to run, to get away from this predator filled lake, 3 of the Merfolk begin to rise from the water. At first they drag themselves onto the shore by their hands, with their fish-like tails flipping back and forth in some kind of sick excitement. Then, as their full bodies are on dry land, their tails begin to change form into 2 human legs. The Merfolk stand and stare you down with their dead black eyes. You take off running into the woods, but you aren't fast enough. They catch you before you even get off the beach, and they eat you.");
                    resetLevel();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
        leavePrompt();
    }

    public void startLevel2() {
        clearScreen();
        System.out.println("--------------Abandoned Castle Level 2---------------");
        System.out.println("\nStanding just in front of the castle gates, you look up to take in the full size of the impressive building. It doesn't appear to be anywhere near the size of the Royal Court, but that's to be expected since only a Lord lived here. Looking back now at the gate in front of you, covered in spiderwebs and moss, you wonder if any loot could possibly be worth it. Part of the wrought iron gate has been bent outwards just enough to allow you to squeeze through, an obvious sign that this place has seen quite a few bandits. Once through the gate, you enter a courtyard that has definitely seen better days, the gardens are all overgrown and some sections look recently dug up. Either the bandits have stooped to checking for buried treasure, or they buried some of the loot they found, planning to come back to it later.");
        System.out.println("\nYou decide that since you've come all this way, you may as well check out what this place has to offer, and make your way to the front doors. As you push the heavy doors open you realize they've been ripped halfway off their hinges, and the floor around them is covered in gravel and rocks. Seriously you can't imagine making a louder entrance, hopefully there's no one here that would get angry with your presence. Stepping into the front room of the castle you feel a chill in the air that sends you shivering. You take a few more steps inside and notice a hallway just to the right of the staircase in the center of the room, and upon further inspection, you can see blood staining the stairs in front of you. There are splatters all the way up, on the steps as well as the banister.");
        inputLoop: while (true) {
            System.out.println("\n1. Make your way down the hallway\n2. Follow the blood trail");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    clearScreen();
                    System.out.println("\nThe blood clearly stained the stairs long ago, whatever caused it, and whoever it came from, are not likely to be at the end of it's trail anymore. So you decide instead to go past the stairs and down the hallway. Maybe there will be an entrance to some underground vault down this hallway, after all a lord is not likely to have kept his most precious valuables in his bedrooms upstairs. The first door you come upon leads to a large kitchen, and though a kitchen is not the most likely place to find loot, you decide to go in. On one of the stove tops you see an old copper pot, containing some very old, very rotten soup. Though oddly the soup only looks to be a few days, maybe a few weeks old. The lord of this house was supposed ot have been kicked out years ago, this certainly hasn't been sitting since then. Though it does stand to reason that a bandit or two would set up camp and eat here from time to time, so you let it be.");
                    System.out.println("\nAs you walk through the kitchen, you spot a dumbwaiter in the wall across from you. As you approach it you start to consider where the dumbwaiter may lead, and get the bright idea to climb inside and use it to make you way to a lower floor. What luck you won't even need to find any stairs! You climb inside, grab the rope with both hands, and begin making your decent. After the dumbwaiter is lowered completely below the opening inside the kitchen you realize you weren't prepared for how dark it would get, and pull out and light a match. The match is more than enough to illuminate the space inside the dumbwaiter, so you move to take hold of the rope again with the hand not holding the match. However, before you can restart your decent, you hear a loud creak and the snap of metal from bellow you.");
                    continueGame();
                    System.out.println("\nUneasy now, you attempt to pull the dumbwaiter back up the the kitchen you just came from, but the rope won't budge. You start wiggling around in an attempt to get the dumbwaiter to sway away from the wall to give you space to crawl out, but it's no use, the shaft is only large enough to fit the dumbwaiter. You realize now that you are trapped. You start to pull harder and harder on the rope, eventually dropping the match and letting it go out so you can use both hands. You pull the rope with all your might, try to move in any direction, just to move at all, but it is no use. You will die, stuck in the wall of the Abandoned Castle.");
                    resetLevel();
                    break inputLoop;
                case 2:
                    System.out.println("\nYou decide to make your way up the stairs, morbidly curious about what awaits you at the end of this trail of blood. As you're walking you spot a large sack perfect for carrying loot, and it even looks like it has a few items already stuffed inside, whoever it belonged too must have dropped it when they were carrying out their haul.");
                    inputLoop2: while (true) {
                        System.out.println("\n1. Pick up the loot bag\n2. Leave it behind");
                        this.playerReply = Game.playerInput.nextInt();
                        switch (playerReply) {
                            case 0:
                                System.exit(0);
                            case 1:
                                loot.add("Gold Utensils");
                                loot.add("Ornate Daggers");
                                loot.add("A Silver Ring");
                                System.out.println("\nYou pick up the loot bag and look at the items inside. You find the sack contains " + Arrays.toString(loot.toArray()).replace("[", "").replace("]","") + ", and a lot of cobwebs. Whoever dropped it, did so a while ago.");
                                break inputLoop2;
                            case 2:
                                System.out.println("\nYou decide to leave the loot bag behind, you have enough bad karma as it is.");
                                break inputLoop2;
                            default:
                                System.out.println("Invalid input");
                        }
                    }
                    System.out.println("\nYou continue following the blood trail as it leads you into an oddly well lit room. It seems as though someone got here before you, and followed the trail just as you did. You stop in the hallway just before the door to the lit bedroom, and slowly peak your head around the door frame. Inside the room you see a man sitting on the old bed, his hands full of bandages, he appears to be wounded.");
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
        leavePrompt();
    }

    public void startLevel3() {
        clearScreen();
        System.out.println("--------------Abandoned Castle Level 3---------------");
        leavePrompt();
    }

    public void startLevel4() {
        clearScreen();
        System.out.println("--------------Abandoned Castle Level 4---------------");
        continueGame();
        completeLevel();
    }

    public void finishStory() {
        clearScreen();
        System.out.println("-----------------------The End-----------------------");
        endGameChoices();
    }
}
