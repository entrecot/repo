package com.qaauto.testproject;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private static final Point DEFAULT_ORIGIN = new Point(0, 0);

    public static Plateau create(String input) {
        String[] coordinates = input.split(" ");
        return new Plateau(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
    }

    private Rectangle coordinates;
    private List<Rover> rovers;

    private Plateau(int right, int top) {
      if (right <= DEFAULT_ORIGIN.x || top <= DEFAULT_ORIGIN.y) throw new IllegalArgumentException("Estem tontos o que "+right+", "+top);
      coordinates = new Rectangle(DEFAULT_ORIGIN.x, DEFAULT_ORIGIN.y, right, top);
      rovers = new ArrayList<Rover>();
    }

    public Rectangle getCoordinates() {
        return coordinates;
    }

    public void place(Rover rover) {
        if (positionNotAvailable(rover)) throw new BadPlacementException();
        rovers.add(rover);
    }

    private boolean positionNotAvailable(Rover rover) {
        for (Rover r : rovers) {
            if (r.samePosition(rover)) return true;
        }
        return false;
    }

    public boolean contains(Rover rover) {
        return rovers.contains(rover);
    }

}
