package com.qaauto.testproject;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.awt.Point;
import java.util.Arrays;

import org.junit.Test;

public class RoverTest {

    private Rover createSampleRover() {
        String input = "1 2 N\nLML";
        return Rover.create(input);
    }

    @Test
    public void testSampleRoverPosition() {
        Rover rover = createSampleRover();
        Point expectedPosition = new Point(1, 2);
        assertThat(rover.getPosition(), is(expectedPosition));
    }

    @Test
    public void testSampleRoverDirection() {
        Rover rover = createSampleRover();
        assertThat(rover.getDirection(), is(Direction.NORTH));
    }

    @Test
    public void testSampleRoverSequenceOfMovements() {
        Rover rover = createSampleRover();
        assertThat(rover.getMovements(), is(Arrays.asList(Movement.LEFT, Movement.MOVE, Movement.LEFT)));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testRoverCreationWithInvalidDirection() {
        String input = "1 2 K";
        Rover.create(input);
    }

}
