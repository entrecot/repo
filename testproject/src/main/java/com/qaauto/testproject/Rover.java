package com.qaauto.testproject;

import java.awt.Point;
import java.util.List;

public class Rover {

    public static Rover create(String input) {
        String[] lines = input.split("\n");
        String[] positionAndDirection = lines[0].split(" ");
        Direction direction = Direction.fromString(positionAndDirection[2]);
        List<Movement> movements = Movement.listFromString(lines[1]);
        return new Rover(Integer.parseInt(positionAndDirection[0]), Integer.parseInt(positionAndDirection[1]), direction, movements);
    }

    private Point position;
    private Direction direction;
    private List<Movement> movements;

    private Rover(int x, int y, Direction direction, List<Movement> movements) {
        this.position = new Point(x, y);
        this.direction = direction;
        this.movements = movements;
    }

    public Point getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public List<Movement> getMovements() {
        return movements;
    }

    public boolean samePosition(Rover rover) {
        return position.equals(rover.position);
    }

}
