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

    public void startLevel1() {
        clearScreen();
        System.out.println("-------------Underground Tunnels Level 1-------------");
        System.out.println("\nYou stare into the empty town square wondering if trying to find the mysterious figure's hiding spot is even worth it right now, but something in your gut is telling you to examine the well at the square's center. Once you make your way over to the well you notice that the well bucket has been hoisted up and emptied of water already, but there's another rope reaching all the way down into the dark pit of the well. Seeing this, you think that this well must have two buckets, but you quickly scrap that idea upon the realization that the second rope is far thicker and sturdier than the one holding the bucket. The second rope is meant to hold far more weight. The weight of a human being, you realize, or at least something humanoid. You decide then, to repel down the rope into the well, worst case scenario you take a dip in a well, best case scenario you figure out who the mysterious figure is and what they're up to.");
        continueGame();
        System.out.println("\nYou make your way down the rope and into the well, careful not to give yourself rope burn. Once your boots dip into the water you decide to light a match to look around. This of course was very difficult to do, as you're holding all your weight up on a rope, but somehow you manage. As soon as the match lights, you see a tunnel opening to your right about a foot above the water level. You swing yourself over on the rope and land firmly inside the tunnel. The tunnel is not quite tall enough for you to stand at your full height, but wide enough for two people to walk side by side. A few yards in front of you, a light shines dimly from the right side of the tunnel. You think about turning around and climbing right back out of the well, but notice your feet are already taking you forward towards the light.");
        continueGame();
        System.out.println("\nAs you come upon the light you realize it's another tunnel, this one lined with lit torches. You extinguish your match, just in time as it was starting to burn your fingers, and turn down the new corridor. A few yards in front of you, you can see the tunnel open up into a large cavern. Finally somewhere you can stand up straight. You make your way towards it, more quickly now, but stop a foot before reaching the opening. You stepped on something dry and thin, and it cracks loudly. You wait and listen for any response but it's no use, as you can only hear the rushing of blood in your ears as you begin to panic. Suddenly a shadow appears on the wall across from you. It takes the shape of a man in a robe at first, but then shifts into that of a large winged beast. A dragon.");
        continueGame();
        clearScreen();
        System.out.println("\nYou realize that this means that the hooded figure is, in fact, a shapeshifter. And as odd as it seems, your panic begins to settle.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nWho goes there? Show yourself now or I will burn you alive with my fiery breath!" + Character.RESET);
        System.out.println("\nYou brace yourself and walk around the corner to face the 'dragon.'");
        System.out.println(Game.player.textColor + "\nYou: No you won't." + Character.RESET);
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nW-what?" + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: You're a shapeshifter, not a real dragon, you can't breathe fire." + Character.RESET);
        System.out.println("\nThe shapeshifter heaves a sad sigh and shifts back into their human form, though this time without the black hood and infinite shadows.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nHow'd you figure me out?" + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: There were some pretty big clues." + Character.RESET);
        continueGame();
        clearScreen();
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nWell now that you've followed me into my home, stalker. My name is " + NonPlayerCharacter.CRITION.name + ", you are?" + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: " + Game.player.name + ". Why do you live underground?" + Character.RESET);
        System.out.println("\nYou look around the cavern and spot some fairly luxurious furnishings, other than it being in a tunnel underground, the room looked like it could have belonged to a noble.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: Because there are no rules down here, I do what I want. And since most people don't even realize these tunnels exist anymore, I get some peace and quite from everyone else and a safe haven from the war." + Character.RESET);
        System.out.println("\nJust then you both hear a sound coming from another tunnel that leads out of the room. Weird how it's always perfect timing like that, huh? The sound is something between a high pitched squeak and a roar.");
        System.out.println(Game.player.textColor + "\nYou: What was that?!" + Character.RESET);
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: Crap. That is definitely a " + Species.KRYSY.speciesName + ". It sounds like it came from the direction of the Royal Court. I knew they'd get into the castle eventually, I just didn't think they'd find their way in here! Maybe one of them just accidentally stumbled in here, I'm going to see if I can get rid of them before others show up. Coming with?" + Character.RESET);
        inputLoop: while (true) {
            System.out.println("\n1. Enthusiastic yes\n2. Reluctant yes\n3. No");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println(Game.player.textColor + "\nYou: Hell Yes!" + Character.RESET);
                    completeLevel();
                    continueGame();
                    this.startLevel2();
                    break inputLoop;
                case 2:
                    System.out.println(Game.player.textColor + "\nYou: ...not really, but I will." + Character.RESET);
                    completeLevel();
                    continueGame();
                    this.startLevel2();
                    break inputLoop;
                case 3:
                    System.out.println(Game.player.textColor + "\nYou: Nope." + Character.RESET);
                    completeLevel();
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
        System.out.println("\nYou and Crition agree to watch each other's backs and go investigate the sound he believes to be a " + Species.KRYSY.speciesName + " that stumbled into the tunnels. Crition takes you down a tunnel to a side room, that appears to be an understocked royal armory. He definitely stole all the weapons from the castle, but that's the least of your worries right now. Crition pulls a set of throwing stars out of a drawer, and you start to wonder if this is all some ridiculous dream. Finally, you walk up to a weapons wall to choose one for yourself.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: What are you doing?" + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Picking a weapon so we can deal with what ever is in the tunnels." + Character.RESET);
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: No, no, you can have this shield, that's it. I've got to keep the rest of these babies in prime condition, it's all about the resale value." + Character.RESET);
        System.out.println("\nCrition hands you a shield that's clearly seen better days, though appears to be intact. Great, you're going to die holding on to some rusty old shield so he can sell the actual weapons at full price.");
        continueGame();
        clearScreen();
        System.out.println("\nInstead of asking what he expects to be able to accomplish with some throwing stars and an old shield, you decide to just accept your fate and die in the tunnels. Crition heads out of the room and towards the direction the noise came from, you quickly follow him out of the room and stick close as you walk through the tunnels. After walking through a few tunnels, you hear the squeak/roar again, this time far far closer. Crition points to another tunnel opening a few feet in front of you, and you both head for it.");
        System.out.println("\nYou round the corner with your shield up, and peek over the top of it to find your enemy. To your surprise, you find the room empty. Crition makes his way into the room, stops in the center, and looks up. You follow his eyes to find a grate in the ceiling. The " + Species.KRYSY.speciesName + " you heard earlier roars again and you hear a clash of metal. You move to stand under the grate with Crition and realize the grate isn't holding up to the weight of the battle raging on top of it. It's about to break open, unleashing the forces at war above you into the room.");
        inputLoop: while (true) {
            System.out.println("\n1. Stay and fight\n2. Leave Crition to handle it");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    completeLevel();
                    this.startLevel3();
                    break inputLoop;
                case 2:
                    this.nextArea();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
    };

    public void startLevel3(){
        clearScreen();
        System.out.println("-------------Underground Tunnels Level 3-------------");
        System.out.println("\nAfter see what's going on on the other side of that grate, you decided you'd need an actual weapon before making any feeble attempt at joining the fray. You ran to the weapons room and blindly grabbed whatever was closest to you on the wall, which turned out to be a chainsaw. Seriously, what is it with this place? Now, you're on your way back to the room you left Crition in, wondering why you didn't pay more attention to the weapon you were grabbing. It's easy to find your way back to the room as the sounds of the fight are much louder now and easy to follow. As you pass through the doorway, you realize chaos has erupted in the room.");
        System.out.println("\nCrition is pinned in a corner by what must be a 7ft tall rat-like creature standing on its hind legs, a " + Species.KRYSY.speciesName + ". In its up raised hand (paw?) you see a long sword, preparing to be brought down on Crition's head. You start the chainsaw and it's roar is so loud that it can be heard over the clanking of weapons, and all in the room, " + Species.KRYSY.speciesName + " and Royal Guard alike, turn to look at you.");
        System.out.println("\nWhat will you do now?\n1. Play it cool\n2. Act like a crazy person\n3. Rush the room");
        inputLoop: while (true) {
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println(Game.player.textColor + "\nYou: Don't make me use this..." + Character.RESET + "\n\nYou say through gritted teeth.");
                    System.out.println("\nUnfortunately no one even heard that Clint Eastwood worthy line, as the " + Species.KRYSY.speciesName + " began screaming and climbing up each other to get out of the room as soon as the chainsaw started up. The good news is, you and Crition are safe, and you didn't even have to use your ridiculous weapon. The bad news is, the room is full of wounded guards all staring at you.");
                    break inputLoop;
                case 2:
                    System.out.println(Game.player.textColor + "\nYou: AHHHHHHHH!" + Character.RESET);
                    System.out.println("\nYou scream wildly with wide eyes and flail the chainsaw around in hopes of scaring everyone away from you. Unfortunately everyone in the room is just really confused and stares at you wondering what you could possibly hope to accomplish with this technique. Fortunately the handful of Royal Guards in the room gain their composure back first and begin attacking the " + Species.KRYSY.speciesName + " while they're still distracted. Some even manage to disarm their enemies. Soon the guards have the " + Species.KRYSY.speciesName + " backed into each other in the center of the room. The rat-like soldiers begin to panic and climb up each other back into the castle where more guards await them. The guards in the room with you however do not make their way back up to the castle, many are wounded and will likely not be going anywhere anytime soon.");
                    break inputLoop;
                case 3:
                    System.out.println(Game.player.textColor + "\nYou: AHHHHHHHH!" + Character.RESET);
                    System.out.println("\nYou charge into the room at full speed, eyes closed, hoping for the best. This tactic does not work out for you, unsurprisingly, and you leave many on both sides wounded in your wake. Fortunately your lack of fear, and horrifying strategy, have caused the " + Species.KRYSY.speciesName + " to flee in abject terror. They quickly make their way up the grate back into the castle. For a moment you begin to smile, proud of your accomplishment, then you look around the room and see all the Royal Guards you just wounded. They lay on the floor staring up at you.");
                    System.out.println(Game.player.textColor + "\nYou: Sorry..." + Character.RESET);
                    System.out.println("\nThe guard closest to you begins to laugh and tells you not to worry about it. Man these guys are easy to please.");
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
        continueGame();
        clearScreen();
        System.out.println("\nThe " + Species.KRYSY.speciesName + " are gone, but now you've got a room full of wounded soldiers to deal with, and Crition does not look happy. You see him muttering to himself and make your way over to him.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: ...why'd couldn't it just have been the " + Species.KRYSY.speciesName + "? Why'd they have to show up too?" + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Wait, you'd rather have the " + Species.KRYSY.speciesName + " here than the Royal Guards? Why?" + Character.RESET);
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: I told you! I was pretty much the last person left in the kingdom that knew about the tunnels! Now the whole castle's gonna know and be using 'em. Taking all my stuff. Kicking me out." + Character.RESET);
        continueGame();
        System.out.println("\nJust then one of the guards who had managed to come out of the altercation unscathed walked up and began speaking with Crition. They seemed to be trying to come to an agreement about the guards staying there while they healed. You knew you had nothing to offer the conversation so you left the room in search of medical supplies for the wounded. As you wandered through the corridors you realized that this was a prime opportunity to grab a more realistic weapon, and made your way back to the weapons room. You're starting to get to know these tunnels well, you realize, as you were quickly able to find your way back. When you get into the room you immediately put the chainsaw back where you got it, and grab a simple short sword.");
        leavePrompt();
    };

    public void startLevel4(){
        clearScreen();
        System.out.println("-------------Underground Tunnels Level 4-------------");
        System.out.println("\n You head back out into the tunnels to do some exploring with the general goal of finding some medical supplies for the guards. You don't get far when you run into Crition, already carrying a box of medical supplies. You greet each other with a quick nod and head back to the room that could now be called the infirmary, since it's full of wounded guards. As you walk together silently, you hear a sudden splash. You begin to wonder if Crition has a pool in here somewhere too, as you see his eyes suddenly go wide and his head whip towards the sound. It sounds like it came from the same direction you entered the tunnels. The well. You ask Crition what to do, and he stammers for a moment before looking down at the medical supplies in his hands.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: Wait here!" + Character.RESET);
        System.out.println("\nCrition runs off the warn the guards, and you turn and steel you self for an attack. Except you don't really know how you should stand, or how you should hold the sword, you've never really held a sword before. You do your best. You listen intently and begin to hear the sounds of rat-like feet on the stone of the tunnels. They're getting closer, and it sounds like there are a lot of them. After about 2 minutes, which felt like eons, Crition comes running back up to you, holding his throwing stars.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: The guards are bandaging themselves up, they'll come when they can. For now let's give them as much time as possible." + Character.RESET);
        continueGame();
        clearScreen();
        System.out.println("\nYou stand together in silence, for what feels like hundreds more eons, listening to the sounds of " + Species.KRYSY.speciesName + " soldiers making their way into the tunnels and towards you.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: You know, I once got drunk, turned into a dragon, and fell asleep on the Queens road, just at the edge of town. Blocked any carts from going in or out for hours. The tavern nearly ran out of ale by the time they got the shipment in." + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Crition why are you telling me this right now?");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: Thought it was funny. Thought we might die soon." + Character.RESET);
        System.out.println("\nAnd suddenly the " + Species.KRYSY.speciesName + " were upon you.");
        continueGame();
        clearScreen();
        System.out.println("\nYou watch as Crition fights back the hoard of " + Species.KRYSY.speciesName + " trying to block them from the wounded guards just down the tunnel. You lift your short sword and run into the fray. The world goes black except for the flash of steel through the air, all you can hear is metal grinding against metal.");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "\nCrition: " + Game.player.name + ", Get over here with me!" + Character.RESET);
        System.out.println("\nYou hack and slash you way over to Crition, and the two of you stand shoulder to shoulder blocking the " + Species.KRYSY.speciesName + "'s path to the wounded guards. Surprisingly you notice that Crition's throwing stars are doing a good amount of damage, and he's yet to run out of them. Crition uses his weapons to keep too many enemies from getting close, and those that do meet your sword. You quickly realize though that this is not enough, and you are both being pushed back towards the makeshift infirmary. As if they could hear your worried thoughts, Royal Guards stream out of the room and past you to take on the " + Species.KRYSY.speciesName + " head on.");
        System.out.println("\nJust as you turn to leave, Crition takes a " + Species.KRYSY.speciesName + " axe to the shoulder. You beat back the " + Species.KRYSY.speciesName + " that attacked him and wrap your arm around him to pull him back with you to retreat.");
        continueGame();
        System.out.println("\nYou make your way back to the makeshift infirmary to stand as the guards' last line of defence. Taking a look around, you see quite a few bandaged guards left in the room, sitting against the walls. You can see though, that they still aren't ready to go down without a fight, as all have a weapon in their hand, and a determined look on their face. You look to Crition, knowing he needs medical attention himself, but he shakes his head as if to say he'll be fine.");
        if (NonPlayerCharacter.KEVON.isAlive) {
            System.out.println("\nJust as you move to turn back to the door, you notice a shadow move over the hole made in the ceiling earlier.");
            System.out.println(NonPlayerCharacter.KEVON.textColor + "\nKevon: Hey guys! Don't worry I'm here to help!" + Character.RESET);
            System.out.println("\nAs you're wondering how this goofy farmer even made his way into the castle let alone found this entrance into the tunnels, Kevon's hand slips on the edge of the opening and he tumbles in, head first. One of the guards rushes over to administer first aid, but you fear it's too late, the damage doesn't look pretty. Unfortunately, you don't have time to dwell on Kevon right now, as you hear foot steps coming your way.");
            continueGame();
        }
        System.out.println("\nYou can hear the rush of footsteps headed straight for the infirmary and start to calculate your chances of survival, but quickly give that up as you're not liking your odds. Your pursuers reach the entrance of the room, and you're surprised to see that the footsteps you heard were that of the Royal Guard. The guards announce that they have defeated the " + Species.KRYSY.speciesName + " soldiers, and will begin working to block off all entrances to the tunnels. Relieved, Crition slumps to the ground finally accepting medical help from an officer nearby. You're instructed to stay in the room until the guards give the all clear. You are all too happy to sit yourself down on the cold stone floor, and wait.");
        leavePrompt();
    };

    public void finishStory() {
        clearScreen();
        System.out.println("-----------------------The End-----------------------");
        System.out.println("\nAfter another day and night in the tunnels, one of the guards comes to tell you that the war has finally been won. The " + Species.KRYSY.speciesName + " have retreated to their home land and the kingdom is celebrating. Crition has begun to heal from his shoulder wound, but still can't use that arm for much. As you help the wounded make their way out of the tunnels through the entrance to the castle, you're told that you and Crition will be honored by the Queen and Princess for your valor in battle, and your dedication to protecting the guards. You think to yourself that you were just trying to survive, and likely don't deserve an award, but you don't tell anyone because, let's face it, you want the award.");
        System.out.println("\nThat night the kingdom throws a massive party, and you spend most of it drinking and dancing in the courtyard in front of the Royal Court. Just before the sun goes down, Princess Jessica stands on a stage and announces that it is time to honor the heroes of the war and begins announcing names. You realize that this war must have been going on for a long time, as she lists a lot of names. So many names that it begins to feel like a graduation ceremony. Once the Princess says your name, you climb the steps to the stage and she places a medal around your neck.");
        continueGame();
        System.out.println(NonPlayerCharacter.PRINCESS_JESSICA.textColor + "\nPrincess Jessica: Thank you for your service, " + Game.player.name + "." + Character.RESET);
        System.out.println(Game.player.textColor + "\nYou: Thank you, Princess." +Character.RESET);
        System.out.println("\nYou step off the stage, feeling quite proud of yourself, and are greeted by all the interesting character's you've met since walking into " + Tavern.theTavern.areaName + ". It's too bad, you think, that Kevon couldn't be here to see it.");
        endGameChoices();
    }
}
