package com.qaauto.testproject;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
public class PlaceRoverOnPlateauTest {

    private Plateau plateau;
    private Rover rover12;
    private Rover rover13;
    private Rover rover12repeated;

    @Before
    public void createPlateauAndRovers() {
        plateau = Plateau.create("5 5");
        rover12 = Rover.create("1 2 N\nLML");
        rover13 = Rover.create("1 3 N\nLML");
        rover12repeated = Rover.create("1 2 N\nLML");
    }
    @Test
    public void placeOneRoverPlateauContainsIt(){
        plateau.place(rover12);
        assertThat(plateau.contains(rover12), is(true));
    }

    @Test
    public void placeOneRoverPlateauDoesNotContainsOther(){
        plateau.place(rover13);
        assertThat(plateau.contains(rover12), is(false));
    }

    @Test
    public void placeTwoRoversInDifferentPositions(){
        plateau.place(rover12);
        plateau.place(rover13);
        assertThat(plateau.contains(rover12), is(true));
        assertThat(plateau.contains(rover13), is(true));
    }
    
    @Test(expected=BadPlacementException.class)
    public void placeTwoRoversInSamePosition(){
        plateau.place(rover12);
        plateau.place(rover12repeated);
    }
    
}
