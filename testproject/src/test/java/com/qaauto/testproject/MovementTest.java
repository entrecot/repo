package com.qaauto.testproject;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MovementTest {

    @Test
    public void testListFromStringWithAllMovements() {
        String input = "LMRG";
        List<Movement> expectedOutput = Arrays.asList(Movement.LEFT, Movement.MOVE, Movement.RIGHT, Movement.GIRAVOLTA);
        assertThat(Movement.listFromString(input), is(expectedOutput));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testListFromStringWithInvalidMovement() {
        Movement.listFromString("LMRA");
    }

//    @Test
//    public void testFromStringNorth() {
//        assertThat(Direction.fromString("N"), is(Direction.NORTH));
//    }
//
//    @Test
//    public void testFromStringEast() {
//        assertThat(Direction.fromString("E"), is(Direction.EAST));
//    }
//
//    @Test
//    public void testFromStringSouth() {
//        assertThat(Direction.fromString("S"), is(Direction.SOUTH));
//    }
//
//    @Test
//    public void testFromStringWest() {
//        assertThat(Direction.fromString("W"), is(Direction.WEST));
//    }
//
//    @Test(expected=IllegalArgumentException.class)
//    public void testFromInvalidString() {
//        Direction.fromString("T");
//    }
}
