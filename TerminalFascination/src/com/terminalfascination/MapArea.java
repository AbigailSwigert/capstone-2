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
}
