package com.terminalfascination;

public class Tavern extends MapArea {

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

    public void enterArea(){
        if(this.levelsCompleted >= this.maxLevels){
            System.out.println("\nYou may not go back to " + areaName + " at this time.");
        } else {
            System.out.println("\nWelcome to Terminal Fascination, are you ready to start the game?\n1. Yes\n2. Not yet\nPress 0 to quit the game at anytime");
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
        clearScreen();
        System.out.println(Character.RESET + "-----------------Terminal Fascination-----------------");
        System.out.println("\nHello traveler, what is your name?");
        Game.playerInput.nextLine();
        Game.player.name = Game.playerInput.nextLine();
        System.out.println("\nHuh, " + Game.player.name + ", interesting. What species would you like to play as?\n1. Human\n2. Ursataur\n3. Merperson\n4. Shapeshifter");
        inputLoop: while(true) {
            this.playerReply = Game.playerInput.nextInt();
            switch (this.playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    Game.player.species = Species.HUMAN;
                    break inputLoop;
                case 2:
                    Game.player.species = Species.URSATAUR;
                    break inputLoop;
                case 3:
                    Game.player.species = Species.MERPERSON;
                    break inputLoop;
                case 4:
                    Game.player.species = Species.SHAPESHIFTER;
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
        System.out.println("\n" + Game.player.name + " the " + Game.player.species.speciesName + ", this will be a fun game.\n");
        continueGame();
        tavernIntro();
    };

    public void tavernIntro() {
        clearScreen();
        System.out.println("------------------------Intro------------------------");
        System.out.println("\nYou find yourself treking through an unfamiliar kingdom that appears war torn and nearly deserted. The only activity you can see appears to be coming from a fairly lively tavern down the road. You are feeling a bit hungry and would like the chance to rest your legs, so you decide to head that way. Upon reaching the door to the tavern, you spot an old sign just overhead marked with a flowing blue script that reads '" + this.areaName + "' and decide to enter.");
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
        clearScreen();
        System.out.println("\nYou walk over to the bar and sit at one of the bar stools only to discover that the cushion on the stool is doing nothing to make the seat any softer. Just as you're accepting your fate at the world's most uncomfortable stool, the barkeep walks over to you.\n");
        System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "Hi, I'm Aaylephur. You look new around here, whatcha lookin' for?" + Character.RESET);
        inputLoop: while (true) {
            System.out.println("1. Ask about woman in tiara\n2. Ask about man in shadows\n3. Ask about Ursataur comedian\n4. Sit somewhere else");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println(Game.player.textColor + "\nYou: Who's that woman in the Tiara?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "\nAaylephur: That's Princess Jessica, she lives in that massive castle down the road." + Character.RESET);
                    System.out.println(Game.player.textColor + "\nYou: I saw it on my way into town, but I didn't think anyone who lived there would come all the way out to some hole in the wall tavern." + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "\nAaylephur: Watch what you say, The Watery Grave is my tavern. Princess Jessica comes down here to see her friend perform." + Character.RESET);
                    break;
                case 2:
                    System.out.println(Game.player.textColor + "\nYou: Who's that person in the back seemingly producing their own shadows?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "\nAaylephur: No idea, honestly he's giving me the creeps so I'm just avoiding him." + Character.RESET);
                    break;
                case 3:
                    System.out.println(Game.player.textColor + "\nYou: What's up with the comedian?" + Character.RESET);
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "\nAaylephur: That's Adametes, he does stand-up comedy here on clear days, but I don't know much about him, you should ask the Princess about him, he's a close friend of hers. Or you could talk to him yourself, his set is ending soon." + Character.RESET);
                    break;
                case 4:
                    System.out.println("\nYou begin to rise from your seat but stop short when Aaylephur leans towards you and begins to speak quitely.");
                    System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "\nAaylephur: Hey, just a second, you look like the type who pass through here a lot. So in case you're looking for some quick loot, check out the old Abandoned Castle just across the lake. The Lord who used to live there was cast out of the Kingdom years ago, bandits loot it all the time but I hear it's still full of great stuff! Just remember who sent you." + Character.RESET);
                    System.out.println("\nAaylephur winks at you and goes back to work behind the counter. As you walk away from the bar you feel her black shark-like eyes staring at you. You turn to look, thinking you must be imagining it, but she's staring right at you smiling a sharp toothy grin. You can't tell if it's a bad sign, or if she's just happy she might get some kind of commission from you.");
                    sitSomewhere();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void sitNearPrincess() {
        clearScreen();
        System.out.println("\nYou make your way over to a table near the woman in the tiara, and sit down with your chair at the perfect angle to watch her without it being obvious that that's what you're doing. At least, that's what you thought, but now she's staring at you.\nOh no, now she's getting up.\nShe's making her way over to you.\nYou're not as slick as you thought...");
        System.out.println(NonPlayerCharacter.PRINCESS_JESSICA.textColor + "\nHey stranger, I'm Jessica, the Princess of this Kingdom. What's your name?" + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: " + Game.player.name + Character.RESET);
        System.out.println(NonPlayerCharacter.PRINCESS_JESSICA.textColor + "\nPrincess Jessica: It's nice to meet you " + Game.player.name + ". What brings you to our Kingdom in a time of war?" + Character.RESET);
        continueGame();
        System.out.println(Game.player.textColor + "\nYou: A time of war?" + Character.RESET);
        System.out.println("\nThe Princess looks surprised for a moment.");
        System.out.println(NonPlayerCharacter.PRINCESS_JESSICA.textColor + "\nPrincess Jessica: Oh, you didn't know? Didn't you pass any " + Species.KRYSY.speciesName + " on your way here? Which direction did you come from?" + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Actually, I don't remember..." + Character.RESET);
        System.out.println("\nPanic starts to set in as you realize you truly don't remember coming to this Kingdom. The only thing you can remember is spotting " + this.areaName + " in the distance. Well you can remember your name too, that's a good sign...right?");
        continueGame();
        System.out.println(NonPlayerCharacter.PRINCESS_JESSICA.textColor + "\nPrincess Jessica: Well, just to get you up to speed, we're at war with the " + Species.KRYSY.speciesName + ". They're currently swarming throughout the Kingdom, though today happens to be a rare clear day. Likely they're regrouping right outside our borders. We're always looking for new soldiers to help end this war once and for all, if you're up for it. Anyway, my friend is gonna finish his set soon then we're heading out. Come see me at the Royal Court sometime if you're looking to help." + Character.RESET);
        System.out.println("\nPrincess Jessica goes back to sit down at her own table and waits for her friend's set to finish up. You realize you never got the chance to ask her who/what the " + Species.KRYSY.speciesName + " even are. You'll have to remember to do that if you choose to go see her at the Royal Court.");
        sitSomewhere();
    }

    public void followCrition() {
        clearScreen();
        System.out.println("\nYou follow the mysterious figure out the door and into the town. The sun is beginning to set so you worry about being able to stay close enough to see his dark figure, without him knowing you're there. You seem to do a fairly good job, as you manage not to lose him through the winding alleyways of the town and make your way into the town square. As he reaches a well in the center of the town square you seem him begin to turn, so you slink back around a corner to keep from being seen. You wait a few seconds and peak around the corner to see he's disappeared.");
        continueGame();
        completeLevel();
        UndergroundTunnels.theUndergroundTunnels.enterArea();
    }

    public void talkToAdametes() {
        clearScreen();
        System.out.println("\nYou make your way over to Adametes, just as his friends leave.");
        System.out.println(NonPlayerCharacter.ADAMETES.textColor + "\nAdametes: Oh it's the " + Game.player.species.speciesName + " from earlier! Sorry to call you out like that man." + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Oh, don't worry about it, I'm " + Game.player.name + " by the way. Do you know who that guy in the shadows was? Does he come to your shows often?" + Character.RESET);
        System.out.println(NonPlayerCharacter.ADAMETES.textColor + "\nAdametes: Never seen him before, and that usually means he's a drifter, like yourself, or that pesky shapeshifter that lives underground. He's constantly getting drunk and shifting into a dragon to play pranks. More than once, he's shifted into the Queen and walked right into the Royal Vault and robbed us in broad daylight. Princess Jessica can't figure out how he's even getting in, but I'm convinced there are tunnels below the castle, it would explain everything." + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: You guys don't know how to get into the tunnels?" + Character.RESET);
        System.out.println(NonPlayerCharacter.ADAMETES.textColor + "\nAdametes: Nope, I managed to follow him to the town square a few times, but once I rounded the corner, he had just disappeared. So the entrance has to be there somewhere. I spent a few weeks searching but turned up nothing by the time this war started. Now there are more pressing matters." + Character.RESET);
        continueGame();
        System.out.println(Game.player.textColor + "\nYou: Well just because you lost him in the town square doesn't mean that there's some secret entrance there, he could have turned into something so small that you couldn't see him anymore. Like a fly." + Character.RESET);
        System.out.println(NonPlayerCharacter.ADAMETES.textColor + "\nAdametes: Ah, come on, don't do me like that man. I thought I was really on to something there, I refuse to believe he's just been turning into a bug all this time! Anyway, it's getting late and you should find somewhere safe to stay. Today was a clear day, but the " + Species.KRYSY.speciesName + " aren't likely to give us a full day and night to recuperate before their next attack. You can stay at my Cottage in the woods near the castle if you'd like." + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Wow, that's very generous. I'm going to do a bit more exploring in the town before nightfall, but I may take you up on your offer." + Character.RESET);
        System.out.println(NonPlayerCharacter.ADAMETES.textColor + "\nAdametes: Sounds good, just don't go to that Abandoned Castle across the lake, I know a lot of drifters like yourself go there to loot it now that the Lord of the land has been cast out, not that I think you're a bandit of course! But it's safest to stay away, since the war started some of the bandits that have gone in have never come back. We think some " + Species.KRYSY.speciesName + " are holed up there but haven't found enough proof to go and storm it." + Character.RESET);
        nextArea();
    }

    public void sitNearCrition() {
        clearScreen();
        System.out.println("\nYou make your way over to the table nearest the hooded figure, sitting across from the farmer already at the table. You forego any greeting thinking the farmer will ignore you and continue to watch the comedian. You are wrong.");
        System.out.println(NonPlayerCharacter.KEVON.textColor + "\nHey Man! I'm Kevon, it's spelled K-E-V-O-N but pronounced like 'Kevin.'" + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Why?" + Character.RESET);
        System.out.println(NonPlayerCharacter.KEVON.textColor + "\nKevon: My mom wanted to name me Devon, and my dad wanted to name me Kenny. They compromised on Kevon. Anyway, how are you enjoying Adametes' routine?" + Character.RESET);
        System.out.println("\nJust then, you notice the mysterious figure get up to leave. You try to follow him with your eys, but he seems to have timed his exit with the end of Adametes' routine, and all of the patrons are now giving him a standing ovation. Apparently you should have paid more attention to the show, people loved it. The perpetual shadows dripping off the mysterious figure seem to be helping him slither through the crowd, cause you had just about lost him when you noticed the door to the tavern open. The mysterious figure slips though the door, as Adametes greets his friends in the crowd.");
        inputLoop: while (true) {
            System.out.println("\nWill you follow the mysterious figure, or introduce yourself to Adametes?\n1. Follow the mysterious figure\n2. Talk to Adametes");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    followCrition();
                    break inputLoop;
                case 2:
                    talkToAdametes();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void completeLevel(){
        this.levelsCompleted += 1;
        PlayerStats.allCompletedLevels.put(this.areaName, levelsCompleted);
    };

}
