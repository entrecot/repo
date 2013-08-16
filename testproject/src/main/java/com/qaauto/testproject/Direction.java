package com.qaauto.testproject;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public static Direction fromString(String input) {
        switch (input) {
        case "N": return NORTH;
        case "E": return EAST;
        case "S": return SOUTH;
        case "W": return WEST;
        }
        throw new IllegalArgumentException("Bad input "+input);
    }
}
