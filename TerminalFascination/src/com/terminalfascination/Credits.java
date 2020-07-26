package com.terminalfascination;

// Abstraction
abstract class Credits {

    public static void printGameCredits() {
        System.out.println(Character.RESET + "\n-------------Terminal Fascination Credits-------------");
        System.out.println("\nWriter and Developer: Abigail Swigert");
        System.out.println("\nCharacter Inspiration:");
        System.out.println(NonPlayerCharacter.AAYLEPHUR.textColor + "Aaylephur The Merperson:       Abigail Swigert");
        System.out.println(NonPlayerCharacter.ADAMETES.textColor + "Adametes The Ursataur:         Adam Rice");
        System.out.println(NonPlayerCharacter.CRITION.textColor + "Crition The Shapeshifter:      Christian Gonzalez");
        System.out.println(NonPlayerCharacter.GABEL.textColor + "Gabel The Human:               Gabe Chavez");
        System.out.println(NonPlayerCharacter.KEVON.textColor + "Kevon The Human:               Devon Brewster");
        System.out.println(NonPlayerCharacter.PRINCESS_JESSICA.textColor + "Princess Jessica The Human:    Jessica Ulysse" + Character.RESET);
    }
}
