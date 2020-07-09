package com.terminalfascination;

abstract class MapArea {
    String areaName;
    NonPlayerCharacter areaCompanion;
    int maxLevels = 5;
    int levelsCompleted = 0;
    int playerReply;

    Player player = Player.getInstance(null, null);

    public void completeLevel() {
        this.levelsCompleted += 1;
        if(this.levelsCompleted >= this.maxLevels) {
            this.finishStory();
        }
    }

    public void enterArea(){
        if(this.levelsCompleted >= this.maxLevels){
            System.out.println("You may not go back to " + areaName + " at this time.");
        } else if(this.levelsCompleted > 0){
            System.out.println("You have returned to " + areaName + ".");
        } else {
            System.out.println("You have entered " + areaName + ", best of luck.");
        }
    };

    public void finishStory(){
        System.out.println("You have survived " + this.levelsCompleted + " days in the " + this.areaName + ". Congratulations on winning the game.");
        System.exit(0);
    };

    public void nextArea() {
        System.out.println("\nWhere would you like to go?\n0. Quit game\n1. The Royal Court\n2. The Abandoned Castle\n3. The Underground Tunnels\n4. The Woods");
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

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void startLevel1(){};
    public void startLevel2(){};
    public void startLevel3(){};
    public void startLevel4(){};
    public void startLevel5(){};
}
