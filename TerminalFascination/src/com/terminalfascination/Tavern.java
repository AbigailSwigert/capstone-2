package com.terminalfascination;

import com.sun.jdi.CharType;

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
        System.out.println("\nHuh, " + player.name + ", interesting. What species would you like to play as?\n1. Human\n2. Ursataur\n3. Merperson\n4. Shapeshifter");
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
        System.out.println("\n" + player.name + " the " + player.species.speciesName + ", this will be a fun game.\n");
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
        System.out.println("You find yourself treking through an unfamiliar kingdom that appears war torn and nearly deserted. The only activity you can see appears to be coming from a fairly lively tavern down the road. You are feeling a bit hungry and would like the chance to rest your legs, so you decide to head that way. Upon reaching the door to the tavern, you spot an old sign just overhead marked with a flowing blue script that reads '" + this.areaName + "' and decide to enter.");
        continueGame();
        System.out.println("\nYou open the door, and stand for a moment in the doorway, letting your eyes adjust to the dark room before scanning the crowd. Behind the bar you see a woman with pale grey skin, long pink hair, and black pupilless eyes. She's beautiful, but in that way that makes you think she might eat you, so you decide she must be one of the Merfolk. You continue scanning the crowd, spotting multiple farmers and other peasants, noticing nothing out of the ordinary. That is until you see a beautiful young black woman with the gleam of a tiara on her head.");
        continueGame();
        System.out.println(NonPlayerCharacter.ADAMETES.textColor + "\n'Look they have no idea we're even talking about them!'" + Character.RESET);
        System.out.println("\nYou hear someone say as the room erupts into laughter. You move your eyes up to a stage on the opposite side of the room from the bar and notice an Ursataur comedian staring at you, along with the rest of the tavern's patrons.");
        System.out.println(NonPlayerCharacter.ADAMETES.textColor + "\n'Close the door already man, we've been waiting with bated breath to see what you do next.'" + Character.RESET);
        System.out.println("\nThe patrons erupt into laughter again and you begin to wonder just how long you've been standing there staring into the tavern. As you take a few steps into the tavern, finally closing the door behind you, you notice movement in the very back corner. A hooded figure shrouded in shadow, so much shadow that you think to yourself, 'Seriously, where is all that shadow coming from? Is he made of shadow? Is that corner of the room located in another dimension that the light of the tavern's candles can't reach?' How mysterious.");
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
        System.out.println("\nYou walk over to the bar and sit at one of the bar stools only to discover that the cushion on the stool is doing nothing to make the seat any softer. Just as you're accepting your fate at the world's most uncomfortable stool, the barkeep walks over to you.\n");
        System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "Hi, I'm Aaylephur. You look new around here, whatcha lookin' for?" + Character.RESET);
        inputLoop: while (true) {
            System.out.println("1. Ask about woman in tiara\n2. Ask about man in shadows\n3. Ask about Ursataur comedian\n4. Sit somewhere else");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println(player.textColor + "\nYou: Who's that woman in the Tiara?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "\nAaylephur: That's Princess Jessica, she lives in that massive castle down the road." + Character.RESET);
                    System.out.println(player.textColor + "\nYou: I saw it on my way into town, but I didn't think anyone who lived there would come all the way out to some hole in the wall tavern." + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "\nAaylephur: Watch what you say, The Watery Grave is my tavern. Princess Jessica comes down here to see her friend perform." + Character.RESET);
                    break;
                case 2:
                    System.out.println(player.textColor + "\nYou: Who's that person in the back seemingly producing their own shadows?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "\nAaylephur: No idea, honestly he's giving me the creeps so I'm just avoiding him." + Character.RESET);
                    break;
                case 3:
                    System.out.println(player.textColor + "\nYou: What's up with the comedian?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "\nAaylephur: He does stand-up comedy here on clear nights, but I don't know much about him, you should ask the Princess about him, he's a close friend of hers. Or you could talk to him yourself, his set is ending soon." + Character.RESET);
                    break;
                case 4:
                    sitSomewhere();
                    break inputLoop;
            }
        }
    }

    public void sitNearPrincess() {
        System.out.println("You make your way over to a table near the woman in the tiara, and sit down with your chair at the perfect angle to watch her without it being obvious that that's what you're doing. At least, that's what you thought, but now she's staring at you.\nOh no, now she's getting up.\nShe's making her way over to you.\nYou're not as slick as you thought...");
        System.out.println(NonPlayerCharacter.PRINCESS_JESSICA.textColor + "\nHey stranger, I'm Jessica, the Princess of this Kingdom. What's your name?" + Character.RESET);
        System.out.println(player.textColor + "\nYou: " + player.name + Character.RESET);
        System.out.println(NonPlayerCharacter.PRINCESS_JESSICA.textColor + "\nPrincess Jessica: It's nice to meet you " + player.name + ". What brings you to our Kingdom in a time of war?" + Character.RESET);
        System.out.println(player.textColor + "\nYou: A time of war?" + Character.RESET);
        System.out.println("\nThe Princess looks surprised for a moment.");
        System.out.println(NonPlayerCharacter.PRINCESS_JESSICA.textColor + "\nPrincess Jessica: Oh, you didn't know? Didn't you pass any " + Species.KRYSY.speciesName + " on your way here? Which direction did you come from?" + Character.RESET);
        System.out.println(player.textColor + "\nYou: Actually, I don't remember..." + Character.RESET);
        System.out.println("\nPanic starts to set in as you realize you truly don't remember coming here. The only thing you can remember is spotting " + this.areaName + " in the distance. Well you can remember your name, that's a good sign...right?");
        System.out.println(NonPlayerCharacter.PRINCESS_JESSICA.textColor + "\nPrincess Jessica: Well, just to get you up to speed, we're at war with the " + Species.KRYSY.speciesName + ". They're currently swarming throughout the Kingdom, though today happens to be a rare clear day. Likely they're regrouping right outside our borders. We're always looking for new soldiers to help end it once and for all, if you're up for it. Anyway, my friend is gonna finish his set soon then we're heading out. Come see me at the Royal Court sometime if you're looking to help." + Character.RESET);
        System.out.println("\nPrincess Jessica goes back to sit down at her own table and waits for her friend's set to finish up. You realize you never got the chance to ask her who/what the " + Species.KRYSY.speciesName + " even are. You'll have to remember to do that if you choose to go see her at the Royal Court.");
        sitSomewhere();
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
