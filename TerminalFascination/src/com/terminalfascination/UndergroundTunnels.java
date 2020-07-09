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

//    public void finishStory() {
//
//    }

    public void enterArea() {
        switch (levelsCompleted) {
            case 0:
                this.startLevel1();
                break;
            case 1:
                this.startLevel2();
                break;
            case 2:
                this.startLevel3();
                break;
            case 3:
                this.startLevel4();
                break;
            case 4:
                this.startLevel5();
                break;
            case 5:
                this.finishStory();
                break;
            default:
                System.out.println("There was an error in the number of levels completed in " + this.areaName + ", please restart your game.");
                System.exit(0);
        }
    }

    public void startLevel1() {
        clearScreen();
        System.out.println("-------------Underground Tunnels Level 1-------------");
        System.out.println("You stare into the empty town square wondering if trying to find the mysterious figure's hiding spot is even worth it right now, but something in your gut is telling you to examine the well at the square's center. Once you make your way over to the well you notice that the well bucket has been hoisted up and emptied of water already, but there's another rope reaching all the way down into the dark pit of the well. Seeing this, you think that this well must have two buckets, but you quickly scrap that idea upon the realization that the second rope is far thicker and sturdier than the one holding the bucket. The second rope is meant to hold far more weight. The weight of a human being, you realize, or at least something humanoid. You decide then, to repel down the rope into the well, worst case scenario you take a dip in a well, best case scenario you figure out who the mysterious figure is and what they're up to.");
        continueGame();
        System.out.println("\nYou make your way down the rope and into the well, careful not to give yourself rope burn. Once your boots dip into the water you decide to light a match to look around. This of course was very difficult to do, as you're holding all your weight up on a rope, but somehow you manage. As soon as the match lights, you see a tunnel opening to your right about a foot above the water level. You swing yourself over on the rope and land firmly inside the tunnel. The tunnel is not quite tall enough for you to stand at your full height, but wide enough for two people to walk side by side. A few yards in front of you, a light shines dimly from the right side of the tunnel. You think about turning around and climbing right back out of the well, but notice your feet are already taking you forward towards the light.");
        continueGame();
        System.out.println("\nAs you come upon the light you realize it's another tunnel, this one lined with lit torches. You extinguish your match, just in time as it was starting to burn your fingers, and turn down the new corridor. A few yards in front of you, you can see the tunnel open up into a large cavern. Finally somewhere you can stand up straight. You make your way towards it, more quickly now, but stop a foot before reaching the opening. You stepped on something dry and thin, and it cracks loudly. You wait and listen for any response but it's no use, as you can only hear the rushing of blood in your ears as you begin to panic. Suddenly a shadow appears on the wall across from you. It takes the shape of a man in a robe at first, but then shifts into that of a large winged beast. A dragon.");
        continueGame();
        System.out.println("\nYou realize that this means that the hooded figure is, in fact, a shapeshifter. And as odd as it seems, your panic begins to settle.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nWho goes there? Show yourself now or I will burn you alive with my fiery breath!" + Character.RESET);
        System.out.println("\nYou brace yourself and walk around the corner to face the 'dragon.'");
        System.out.println(player.textColor + "\nYou: No you won't." + Character.RESET);
        System.out.println("\nThe 'dragon' looks stunned for a moment.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nW-what?" + Character.RESET);
        System.out.println(player.textColor + "\nYou: You're a shapeshifter, not a real dragon, you can't breathe fire." + Character.RESET);
        System.out.println("\nThe shapeshifter heaves a sad sigh and shifts back into their human form, though this time without the black hood and infinite shadows.");
        continueGame();
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nHow'd you figure me out?" + Character.RESET);
        System.out.println(player.textColor + "\nYou: There were some pretty big clues." + Character.RESET);
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nWell now that you've followed me into my home, stalker. My name is " + NonPlayerCharacter.CRITION.name + ", you are?" + Character.RESET);
        System.out.println(player.textColor + "\nYou: " + player.name + ". Why do you live underground?" + Character.RESET);
        System.out.println("\nYou look around the cavern and spot some fairly luxurious furnishings, other than it being in a tunnel underground, the room looked like it could have belonged to a noble.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: Because their are no rules down here, I do what I want. And since most people don't even realize these tunnels exist anymore, I get some peace and quite from everyone else and a safe haven from the war." + Character.RESET);
        System.out.println("\nJust then you both hear a sound coming from another tunnel that leads out of the room. Weird how it's always perfect timing like that, huh? The sound is something between a high pitched squeak and a roar.");
        System.out.println(player.textColor + "\nYou: What was that?!" + Character.RESET);
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: Crap. That is definitely a " + Species.KRYSY.speciesName + ". It sounds like it came from the direction of the Royal Court. I knew they'd get into the castle eventually, I just didn't think they'd find their way in here! Maybe one of them just accidentally stumbled in here, I'm going to see if I can get rid of them before others show up. Coming with?" + Character.RESET);
        inputLoop: while (true) {
            System.out.println("\n1. Enthusiastic yes\n2. Reluctant yes\n3. No");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println(player.textColor + "\nYou: Hell Yes!" + Character.RESET);
                    completeLevel();
                    continueGame();
                    this.startLevel2();
                    break inputLoop;
                case 2:
                    System.out.println(player.textColor + "\nYou: ...not really, but I will." + Character.RESET);
                    completeLevel();
                    continueGame();
                    this.startLevel2();
                    break inputLoop;
                case 3:
                    System.out.println(player.textColor + "\nYou: Nope." + Character.RESET);
                    completeLevel();
                    continueGame();
                    this.nextArea();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
    };

    public void startLevel2(){
        clearScreen();
        System.out.println("-------------Underground Tunnels Level 2-------------");
    };

    public void startLevel3(){
        System.out.println(this.areaName + " level 3");
    };

    public void startLevel4(){
        System.out.println(this.areaName + " level 4");
    };

    public void startLevel5(){
        System.out.println(this.areaName + " level 5");
    };
}
