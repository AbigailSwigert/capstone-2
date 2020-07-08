package com.terminalfascination;

abstract class MapArea {
    String areaName;
    NonPlayerCharacter areaCompanion;
    int maxLevels = 5;
    int levelsCompleted = 0;
    int playerReply;

    public void completeLevel() {
        this.levelsCompleted += 1;
        if(this.levelsCompleted >= this.maxLevels) {
            this.finishStory();
        }
    }

    public void startLevel(){
        if(this.levelsCompleted >= this.maxLevels){
            System.out.println("You may not go back to " + areaName + " at this time.");
        } else if(this.levelsCompleted > 0){
            System.out.println("You have returned to " + areaName + ".");
        } else {
            System.out.println("You have entered " + areaName + ", best of luck.");
        }
    };

    public void finishStory(){
        System.out.println("You have survived " + levelsCompleted + " days in the " + areaName + ". Congratulations on winning the game.");
        System.exit(0);
    };

    public void nextArea() {
        System.out.println("\nWhere would you like to go?\n1. The Royal Court\n2. The Abandoned Castle\n3. The Underground Tunnels\n4. The Woods");
        inputLoop: while (true) {
            this.playerReply = Game.playerInput.nextInt();
            switch (playerReply) {
                case 0:
                    System.exit(0);
                case 1:
                    this.completeLevel();
                    RoyalCourt.theCourt.startLevel();
                    break inputLoop;
                case 2:
                    this.completeLevel();
                    AbandonedCastle.theAbandonedCastle.startLevel();
                    break inputLoop;
                case 3:
                    this.completeLevel();
                    UndergroundTunnels.theUndergroundTunnels.startLevel();
                    break inputLoop;
                case 4:
                    this.completeLevel();
                    Woods.theWoods.startLevel();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }
        }
    }


}
