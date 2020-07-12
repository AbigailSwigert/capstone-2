package com.terminalfascination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

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
            Stream<String> lootStream = loot.stream();
            lootStream.forEach(System.out::println); // I'm only using a stream here because it's a requirement to have a stream
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
        continueGame();
        System.out.println("\nStanding just in front of the castle gates, you look up to take in the full size of the impressive building. It doesn't appear to be anywhere near the size of the Royal Court, but that's to be expected since only a Lord lived here. Looking back now at the gate in front of you, covered in spiderwebs and moss, you wonder if any loot could possibly be worth it. Part of the wrought iron gate has been bent outwards just enough to allow you to squeeze through, an obvious sign that this place has seen quite a few bandits. Once through the gate, you enter a courtyard that has definitely seen better days, the gardens are all overgrown and some sections look recently dug up. Either the bandits have stooped to checking for buried treasure, or they buried some of the loot they found, planning to come back to it later.");
        leavePrompt();
    }

    public void startLevel2() {
        clearScreen();
        System.out.println("--------------Abandoned Castle Level 2---------------");
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
        System.out.println("\nThe wounded man on the bed seems harmless enough, you think. He carries no weapon, and he looks quite tired, along with being wounded. You decide to enter the room and ask if he needs any help. At the sound of your strange voice, the wounded man turns. You can tell now that he's a slightly older man, appearing to be in his 40's, and he looks quite surprised to see you there.");
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nOh. Who are you?" + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: I'm " + Game.player.name + "." + Character.RESET);
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nWell hello, " + Game.player.name + ". They call me Gabel. I am doing better now, thank you for asking. What are you doing here in this Abandoned Castle? Looking for loot as well?" + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Just curious about what I might find. How long have you been here? The blood trail I followed to this room is old enough to have already dried and stained the floors." + Character.RESET);
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: I've been laying in this room for days, healing from a " + Species.KRYSY.speciesName + " attack. I had finally found the old Lord's vault, and it was as full of treasure as everyone always claimed, but apparently one of those damn rat soldiers had followed me down there to take the loot for themselves." + Character.RESET);
        continueGame();
        System.out.println("\nYou see Gabel begin to struggle to get out of the bed, clutching his bandaged left side. Immediately, you move to help him up.");
        System.out.println(Game.player.textColor + "\nYou: I'm  not sure you're ready to be moving around just yet." + Character.RESET);
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: I know, but unfortunately I need to grab what I came here for and head home. My wife and daughters are waiting for me, I was to bring home enough loot to buy our way out of this kingdom and away from this war." + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Perhaps I could get your loot for you. Tell me where you left it and I can bring it up here to you." + Character.RESET);
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: Look, you seem like a good person and all, but I've dealt with enough bandits coming through here, not to trust someone with the location of my stash." + Character.RESET);
        System.out.println("\nHe has a good point you realize, how could he trust you more than any other person who came through this castle looking for a quick score?");
        continueGame();
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: Actually, I do have an idea. I may not be able to trust you to go get it on your own, but perhaps you could help me get to my stash and I'll split it with you." + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Don't you need all of it? For your wife and daughters?" + Character.RESET);
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: Oh no, not all of it. There's more than enough down there to go around. Trust me." + Character.RESET);
        inputLoop: while (true) {
            System.out.println("\n1. Help Gabel\n2. Leave him to heal");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    completeLevel();
                    System.out.println("\nYou find yourself wanting to help the kind man, and agree to escort him to his loot and split it with him. If all goes well, Gabel will be able to protect his family from this war, and you'll be walking out of here with some easy loot.");
                    continueGame();
                    this.startLevel4();
                    break inputLoop;
                case 2:
                    System.out.println("\nYou decide you're not up to helping a wounded stranger around an old creepy castle, but assure him that you may come back later and help him if he's still in need.");
                    this.nextArea();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void startLevel4() {
        clearScreen();
        System.out.println("--------------Abandoned Castle Level 4---------------");
        System.out.println("\nYou walk around the bed and wrap Gabel's left arm around your shoulders. Slowly you make your way out of the room towards the stairs, trying not to move too quickly for Gabel. It feels like it takes hours for Gabel to limp down the stairs, but eventually you both make it down and round the corner to go down the hallway you spotted earlier. You walk past a few doors, one of which that appears to lead to a kitchen, and eventually stop in front of an old wooden stand. Whatever used to be displayed on this stand has long since been stolen. To your surprise, Gabel reaches down to the bottom side of the stand and you hear the sound of a switch being flipped. Almost immediately a panel in the wall pops open like a door.");
        System.out.println(Game.player.textColor + "\nYou: How did you find that?" + Character.RESET);
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: I've been here for quite a while." + Character.RESET);
        System.out.println("\nYou start to worry about how long he's been gone from home, and if his wife and daughters even know he's still alive. You become determined ot help him get home to them as soon as possible.");
        continueGame();
        System.out.println("\nYou make your way down a set of very dark stairs, careful to keep Gabel from slipping. At the bottom of the stairs a single torch is lit, giving you a beacon to focus on. When you reach the bottom of the stairs, the single torch's light is just enough for you to see that you've entered a massive cavernous room, full of sparkling trinkets. Gabel pulls his arm off your shoulders and clutches his right side while making his way around the room to light all of the torches. Once the space is completely illuminated, you can't help but stare in awe at the priceless artifacts around you. The room is full of master-crafted weapons, and full sets of armor, as well as coffers full of gold and jewels.");
        System.out.println(Game.player.textColor + "\nYou: Where did all this come from? I thought this was the home of a disgraced Lord? This looks like the loot a King would take after a war." + Character.RESET);
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: You don't know why the Lord was cast out? He was known for attacking neighboring Lords, in this kingdom and in others. Supposedly he had a strong bloodlust, and would steal the treasures of those he bested just because he could." + Character.RESET);
        continueGame();
        System.out.println(Game.player.textColor + "\nYou: Ah, we're stealing from a terrifying psychopath. Great." + Character.RESET);
        System.out.println("\nGabel chuckles as he searches the room. After a few seconds he finds what it is he was looking for, and it appears to be a barrel of ale. However, once Gabel pries the top open, you realize it's where he's hidden all the valuables that are easy to move. As you walk up to the barrel to peak inside, Gabel steps aside and motions towards the barrel.");
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: You've held up your end of the bargain, go ahead, take your pick." + Character.RESET);
        System.out.println("\nYou peak inside the barrel and spot a gleaming sword with a gold pommel, a small tiara encrusted with jewels, and a sack of gold coins. ");
        inputLoop: while (true) {
            System.out.println("\n1. Take the sword\n2. Take the tiara\n3. Take the gold coins\n4. Take nothing");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    loot.add("Sword with Gold Pommel");
                    System.out.println("\n");
                    printLoot();
                    System.out.println("\nYou take the sword, and thank Gabel for sharing his loot with you.");
                    System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: I remember when I got that sword." + Character.RESET);
                    System.out.println(Game.player.textColor + "\nYou: What?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: My father had it made to celebrate my 18th birthday. He told me 'You're a man now.' But, how was I supposed to become a man while remaining in my father's shadow? By that time, he had already been Lord of the land for a good 30 years. It was time for a new Lord, it was time I stepped out of my father's shadow and started taking what was mine." + Character.RESET);
                    System.out.println(Game.player.textColor + "\nYou: Gabel...what are you talking about." + Character.RESET);
                    break inputLoop;
                case 2:
                    loot.add("Jewel Encrusted Tiara");
                    System.out.println("\n");
                    printLoot();
                    System.out.println("\nYou take the tiara, and thank Gabel for sharing his loot with you.");
                    System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: That belonged to my oldest daughter. I had it made for her when she was only 4." + Character.RESET);
                    System.out.println(Game.player.textColor + "\nYou: What?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: My poor daughters, cast out of their home by Lords and Ladies who feared their dear father. If only these Lords and Ladies were capable of protecting themselves, they'd have no reason to fear me." + Character.RESET);
                    System.out.println(Game.player.textColor + "\nYou: Gabel...what are you talking about." + Character.RESET);
                    break inputLoop;
                case 3:
                    loot.add("Sack of Gold Coins");
                    System.out.println("\n");
                    printLoot();
                    System.out.println("\nYou take the gold coins, and thank Gabel for sharing his loot with you.");
                    System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: Ah, simple gold coins, a good choice. What would you have spent them on? If you could have gotten out of here alive." + Character.RESET);
                    System.out.println(Game.player.textColor + "\nYou: What?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: You really are too trusting. Didn't your parents ever tell you not to walk off with strangers? It is quite irresponsible." + Character.RESET);
                    System.out.println(Game.player.textColor + "\nYou: Gabel...what are you talking about." + Character.RESET);
                    break inputLoop;
                case 4:
                    System.out.println(Game.player.textColor + "\nYou: Actually, I don't think I will take anything. I'm happy just to help you get home to your family." + Character.RESET);
                    System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: Nothing, really? Then you will have died for nothing." + Character.RESET);
                    System.out.println(Game.player.textColor + "\nYou: What?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: You're too naive, to believe some random bandit could discover my vault, and would share the loot with you! Laughable really." + Character.RESET);
                    System.out.println(Game.player.textColor + "\nYou: Gabel...what are you talking about." + Character.RESET);
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
        continueGame();
        if (NonPlayerCharacter.KEVON.isAlive) {
            System.out.println(NonPlayerCharacter.KEVON.textColor + "\nKevon: Woah. talk about a lucky find. Oh hey, it's " + Game.player.name + "! What are you doing down here? Who's this other guy?" + Character.RESET);
            System.out.println("\nYou turn around to find Kevon just at the foot of the stairs, looking back and forth between you and Gabel.");
            System.out.println(Game.player.textColor + "\nYou: Kevon, get out of here!" + Character.RESET);
            System.out.println("\nJust then, a dagger suddenly appears in Kevon's chest. You turn slowly back to Gabel and see his arm still outstretched from throwing the dagger now buried in Kevon's chest.");
            System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: Ah, I never could stand that guy." + Character.RESET);
        }
        System.out.println("\nTerrified you begin to step back, hoping to get back to the stairs before he can get to you. Luckily, you have a slight advantage over him, his wounds have been slowing him down all day. But as you turn to make your escape, he's on you immediately. You claw as his wounds attempting to get him to let you go, but it's no use. Your frantic clawing has only managed to rip off the bandages, underneath them you find scarred, but completely healed over skin. He was faking his injuries to get your guard down. As your heart sinks to the pit of your stomach, Gabel hits you over the head with something heavy, and you drift out of consciousness.");
        continueGame();
        completeLevel();
    }

    public void finishStory() {
        clearScreen();
        System.out.println("-----------------------The End-----------------------");
        loot.clear();
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: Come on " + Game.player.name + ", time to wake up." + Character.RESET);
        System.out.println("\nYou begin to open your eyes, realizing that your head is pounding. It takes a few moments for your eyes to focus, but when they do you realize you're laying on your back staring up at Gabel with the night sky behind him. You try to move your hand up to check how big the welt on the back of your head is, but your hands are tied together. You start to struggle against your bindings and find that Gabel has also used rope to pin your arms to your chest, and your feet and legs together.");
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: Oh, don't bother wiggling about, it's never worked for the rest of them" + Character.RESET);
        System.out.println("\nYou look around you for anything to help you, noticing for the first time that your lying in a wooden box, a few feet in the ground. He's burying you alive. You realize with horror that he's done this many times before, the dug up sections of the courtyard you saw earlier, were the graves of his previous victims. How many people did you walk past that were still alive under the ground? Gabel smiles at you as he watches the realization cross your face.");
        continueGame();
        System.out.println(Game.player.textColor + "\nYou: Why are you doing this? I helped you!" + Character.RESET);
        System.out.println(NonPlayerCharacter.GABEL.textColor + "\nGabel: Oh be serious, " + Game.player.name + ". We both know you came here to rob me after everything had already been taken from my family! I'm sick and tired of your type coming around here, desecrating my home, spitting on my name. I am merely punishing those who think they can take from me!" + Character.RESET);
        System.out.println("\nAt that, Gabel closes the lid to your coffin. You begin to scream, to start making excuses, as if it will get him to let you out, as scoops of dirt land on the wood in front of your face. After a long while your voice becomes hoarse, and you begin to weep. The weight of the dirt is crush in on you now, and you're running out of air. You should have never come to Lord Gabel's castle.");
        Game.player.isAlive = false;
        endGameChoices();
    }
}
