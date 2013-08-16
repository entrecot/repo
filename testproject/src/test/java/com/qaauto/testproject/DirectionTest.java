package com.qaauto.testproject;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class DirectionTest {

    
    @Test
    public void testFromStringNorth() {
        assertThat(Direction.fromString("N"), is(Direction.NORTH));
    }

    @Test
    public void testFromStringEast() {
        assertThat(Direction.fromString("E"), is(Direction.EAST));
    }

    @Test
    public void testFromStringSouth() {
        assertThat(Direction.fromString("S"), is(Direction.SOUTH));
    }

    @Test
    public void testFromStringWest() {
        assertThat(Direction.fromString("W"), is(Direction.WEST));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testFromInvalidString() {
        Direction.fromString("T");
    }
}
