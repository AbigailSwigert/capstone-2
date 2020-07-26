package com.terminalfascination;

// Abstraction
abstract class MapArea {
    String areaName;
    NonPlayerCharacter areaCompanion;
    int maxLevels = 4;
    int levelsCompleted = 0;
    int playerReply;

    public void completeLevel() {
        this.levelsCompleted += 1;
        PlayerStats.allCompletedLevels.put(this.areaName, this.levelsCompleted);
        if(this.levelsCompleted >= this.maxLevels) {
            this.finishStory();
        }
    }

    // Polymorphism via method overriding
    public void enterArea(){
        if(this.levelsCompleted >= this.maxLevels){
            System.out.println("You may not go back to " + areaName + " at this time.");
        } else {
            switch (this.levelsCompleted) {
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
                    this.finishStory();
                    break;
                default:
                    System.out.println("There was an error in the number of levels completed in " + this.areaName + ", please restart your game.");
                    System.exit(0);
            }
        }
    };

    public void nextArea() {
        System.out.println("\nWhere would you like to go?\n0. Quit game\n1. The Royal Court -not available in beta\n2. The Abandoned Castle\n3. The Underground Tunnels\n4. The Woods -not available in beta");
        inputLoop: while (true) {
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    this.completeLevel();
                    RoyalCourt.theCourt.enterArea();
                    break inputLoop;
                case 2:
                    this.completeLevel();
                    AbandonedCastle.theAbandonedCastle.enterArea();
                    break inputLoop;
                case 3:
                    this.completeLevel();
                    UndergroundTunnels.theUndergroundTunnels.enterArea();
                    break inputLoop;
                case 4:
                    this.completeLevel();
                    Woods.theWoods.enterArea();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void continueGame() {
        System.out.println("\nContinue?\n0. Quit game\n1. Continue");
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

    public void leavePrompt() {
        inputLoop: while (true) {
            System.out.println("\n1. Continue\n2. Go somewhere else");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    completeLevel();
                    this.enterArea();
                    break inputLoop;
                case 2:
                    this.nextArea();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void resetLevel() {
        inputLoop: while (true) {
            System.out.println("\n0. Quit game\n1. Reset level");
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    this.enterArea();
                    break inputLoop;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    public void finishStory(){
        System.out.println("You have survived " + this.levelsCompleted + " days in the " + this.areaName + ". Congratulations on winning the game.");
        endGameChoices();
    };

    public void endGameChoices() {
        System.out.println("\n0. End Game\n1. See player stats\n2. Show Game credits");
        inputLoop: while (true) {
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                    break inputLoop;
                case 1:
                    PlayerStats.printPlayerStats();
                    System.out.println("\n0. End Game\n1. See player stats\n2. Show Game credits");
                    break;
                case 2:
                    Credits.printGameCredits();
                    System.out.println("\n0. End Game\n1. See player stats\n2. Show Game credits");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void startLevel1(){};
    public void startLevel2(){};
    public void startLevel3(){};
    public void startLevel4(){};
}
