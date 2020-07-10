package com.terminalfascination;

abstract class Character { // Abstraction
    String name;
    Species species;
    String textColor;

    // Terminal text colors:
    public static final String RESET = "\u001B[0;90m";
    public static final String WHITE = "\u001B[1;97m";
    public static final String RED = "\033[1;31m";
    public static final String GREEN = "\u001B[1;32m";
    public static final String YELLOW = "\033[1;33m";
    public static final String BLUE = "\033[1;34m";
    public static final String PURPLE = "\033[1;35m";
    public static final String CYAN = "\033[1;36m";
}
