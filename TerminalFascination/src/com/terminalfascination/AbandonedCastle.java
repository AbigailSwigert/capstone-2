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
                    System.out.println("\nYou decide to steal the boat, and hope it doesn't have too large an effect on your karma. As you paddle across the lake you begin to notice movement and bright colors under the water. Looking around your boat, you manage to spot a few Merfolk swimming around you. You lock eyes with a few wondering why they're all watching you. Oh no, do they know you stole the boat? Is it one of their boats? Fear starts to set in as you realize that the Merfolk are carnivores." );
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
        System.out.println("\nStanding just in front of the castle gates, you look up to take in the full size of the impressive building. It doesn't appear to be anywhere near the size of the Royal Court, but that's to be expected since only a Lord lived here. Looking back now at the gate in front of you, covered in spiderwebs and moss, you wonder if any loot could possibly be worth it. Part of the wrought iron gate has been bent outwards just enough to allow you to squeeze through, an obvious sign that this place has seen quite a few bandits. Once through the gate, you enter a courtyard that has definitely seen better days, the gardens are all overgrown and some sections look recently dug up. Either the bandits have stooped to checking for buried treasure, or their buried some of the loot they found planning to come back to it later.");
        System.out.println("\n");
    }
}
