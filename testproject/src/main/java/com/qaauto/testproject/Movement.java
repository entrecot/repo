package com.qaauto.testproject;

import java.util.ArrayList;
import java.util.List;

public enum Movement {
  LEFT, RIGHT, MOVE, GIRAVOLTA;

    public static List<Movement> listFromString(String string) {
        List<Movement> result = new ArrayList<Movement>();
        for (char c : string.toCharArray()) {
            result.add(Movement.fromChar(c));
        }
        return result;
    }

    private static Movement fromChar(char c) {
        switch (c) {
            case 'L': return Movement.LEFT;
            case 'R': return Movement.RIGHT;
            case 'M': return Movement.MOVE;
            case 'G': return Movement.GIRAVOLTA;
        }
        throw new IllegalArgumentException("Hey girl!");
    }
}
