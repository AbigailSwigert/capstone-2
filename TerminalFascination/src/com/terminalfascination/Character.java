package com.terminalfascination;

abstract class Character {
    String name;
    Species species;
    String textColor;

    // Terminal text colors:
    public static final String RESET = "\033[0m";
    public static final String BLACK = "\033[1;30m";
    public static final String RED = "\033[1;31m";
    public static final String GREEN = "\033[1;32m";
    public static final String YELLOW = "\033[1;33m";
    public static final String BLUE = "\033[1;34m";
    public static final String PURPLE = "\033[1;35m";
    public static final String CYAN = "\033[1;36m";
    public static final String WHITE = "\033[1;37m";
}
