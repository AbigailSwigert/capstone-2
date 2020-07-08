package com.terminalfascination;

import javax.sound.midi.Soundbank;

public class Tavern extends MapArea {
    Player player = Player.getInstance(null, null);

    private static Tavern tavern_instance = null;

    public Tavern(String areaName) {
        this.areaName = areaName;
        this.maxLevels = 1;
    }

    public static Tavern getInstance(String areaName) {
        if (tavern_instance == null) tavern_instance = new Tavern(areaName);
        return tavern_instance;
    }

    public static final Tavern theTavern = Tavern.getInstance("The Watery Grave");

    public void startLevel(){
        if(this.levelsCompleted >= this.maxLevels){
            System.out.println("You may not go back to " + areaName + " at this time.");
        } else {
            System.out.println("Welcome to Terminal Fascination, are you ready to start the game?\n1. Yes\n2. Not yet\nPress 0 to quit the game at anytime");
            inputLoop: while(true) {
                this.playerReply = Game.playerInput.nextInt();
                switch (this.playerReply) {
                    case 0:
                    case 2:
                        System.exit(0);
                    case 1 :
                        playerIntro();
                        break inputLoop;
                    default:
                        System.out.println("Invalid input");
                }
            }
        }
    };

    public void playerIntro() {
        System.out.println("-----------------Terminal Fascination-----------------");
        System.out.println("Hello traveler, what is your name?");
        Game.playerInput.nextLine();
        player.name = Game.playerInput.nextLine();
        System.out.println("Huh, " + player.name + ", interesting. What species would you like to play as?\n1. Human\n2. Ursataur\n3. Merperson\n4. Shapeshifter");
        inputLoop: while(true) {
            this.playerReply = Game.playerInput.nextInt();
            switch (this.playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    this.player.species = Species.HUMAN;
                    break inputLoop;
                case 2:
                    this.player.species = Species.URSATAUR;
                    break inputLoop;
                case 3:
                    this.player.species = Species.MERPERSON;
                    break inputLoop;
                case 4:
                    this.player.species = Species.SHAPESHIFTER;
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
        System.out.println(player.name + " the " + player.species.speciesName + ", this will be a fun game.\n\n");
        tavernIntro();
    };

    public void continueGame() {
        System.out.println("\nContinue?\n1. Continue\n2. Quit game");
        inputLoop: while (true) {
            this.playerReply = Game.playerInput.nextInt();
            switch (this.playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    break inputLoop;
                default:
                    System.out.println("Invalid command, please enter 1 to continue or 0 to quit the game.");
            }
        }
    }

    public void tavernIntro() {
        System.out.println("------------------------Intro------------------------");
        System.out.println("You find yourself treking through an unfamiliar kingdom that appears war torn and nearly deserted. The only activity you can see appears to be coming from a fairly lively tavern down the road. It's been a while since you ate, so you decide to head that way. Upon reaching the door to the tavern, you spot an old sign just overhead marked with a flowing blue script that reads '" + this.areaName + "' and decide to enter.");
        continueGame();
        System.out.println("You open the door, and stand for a moment in the doorway, letting your eyes adjust to the dark room before scanning the crowd. Behind the bar you see a woman with pale grey skin, long pink hair, and black pupilless eyes. She's beautiful, but in that way that makes you think she might eat you, so you decide she must be one of the Merfolk. You continue scanning the crowd, spotting multiple farmers and other peasants noticing nothing out of the ordinary. That is until you see the gleam of a tiara on a young woman's head.");
        continueGame();
        System.out.println(NonPlayerCharacter.ADAMETES.textColor + "'Look they have no idea we're even talking about them!'" + Character.RESET);
        System.out.println("You hear someone say as the room erupts into laughter. You move your eyes up to a stage on the opposite side of the room from the bar and notice an Ursataur comedian staring at you, along with the rest of the tavern's patrons.");
        System.out.println(NonPlayerCharacter.ADAMETES.textColor + "'Close the door already man, we've been waiting with bated breath to see what you do next.'" + Character.RESET);
        System.out.println("The patrons erupt into laughter again and you begin to wonder just how long you've been standing there staring into the tavern. As you take a few steps into the tavern, finally closing the door behind you, you notice movement in the very back corner. A hooded figure shrouded in shadow, so much shadow that you think to yourself, 'Seriously, where is all that shadow coming from? Is he made of shadow? Is that corner of the room located in another dimension that the light of the tavern's candles can't reach?' How mysterious.");
        sitSomewhere();
    }

    public void sitSomewhere() {
        System.out.println("\nWhere would you like to sit?\n1. The bar\n2. An empty table near the woman in the tiara\n3. A table near the hooded figure, where an unassuming farmer is already sitting");
        inputLoop: while (true) {
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    sitAtBar();
                    break inputLoop;
                case 2:
                    sitNearPrincess();
                    break inputLoop;
                case 3:
                    sitNearCrition();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void sitAtBar() {
        System.out.println("You walk over to the bar and sit at one of the bar stools only to discover that the cushion on the stool is doing nothing to make the seat any softer. Just as you're accepting your fate at the world's most uncomfortable stool, the barkeep walks over to you.\n");
        System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "Hi, I'm Aaylephur. You look new around here, whatcha lookin' for?" + Character.RESET);
        inputLoop: while (true) {
            System.out.println("1. Ask about woman in tiara\n2. Ask about man in shadows\n3. Ask about Ursataur comedian\n4. Sit somewhere else");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println(player.textColor + "Who's that woman in the Tiara?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "That's Princess Jessica, she lives in that massive castle down the road." + Character.RESET);
                    System.out.println(player.textColor + "I saw it on my way into town, but I didn't think anyone who lived there would come all the way out to some hole in the wall tavern." + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "Watch what you say, The Watery Grave is my tavern. Princess Jessica comes down here to see her friend, perform." + Character.RESET);
                case 2:
                    System.out.println(player.textColor + "Who's that person in the back seemingly producing their own shadows?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "No idea, honestly he's giving me the creeps so I'm just avoiding him." + Character.RESET);
                case 3:
                    System.out.println(player.textColor + "What's up with the comedian?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "" + Character.RESET);
            }
        }
    }

    public void sitNearPrincess() {
        System.out.println("You sat at a table near the woman in a tiara");
    }

    public void sitNearCrition() {
        System.out.println("You sat a table with a goofy farmer just to be near the hooded figure");
    }

    public void completeLevel(){
        this.levelsCompleted += 1;
        if (this.levelsCompleted >= this.maxLevels) {
            this.finishStory(); // switch to next area after taking input from player
        }
    };

    public static void nextArea(MapArea nextArea) {
        nextArea.startLevel();
    }

}
