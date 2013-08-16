package com.qaauto.testproject;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.awt.Rectangle;

import org.junit.Test;

public class PlateauTest {

    
    @Test
    public void testSamplePlateauCreation() {
        String input = "5 5";
        Plateau plateau = Plateau.create(input);
        Rectangle expectedPlateauCoordinates = new Rectangle(0, 0, 5, 5);
        assertThat(plateau.getCoordinates(), is(expectedPlateauCoordinates));
    }

    @Test
    public void testBigPlateauCreation() {
        String input = "500000 500000";
        Plateau plateau = Plateau.create(input);
        Rectangle expectedPlateauCoordinates = new Rectangle(0, 0, 500000, 500000);
        assertThat(plateau.getCoordinates(), is(expectedPlateauCoordinates));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroXCoordinateForPlateau() {
        String input = "0 2";
        Plateau.create(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroYCoordinateForPlateau() {
        String input = "2 0";
        Plateau.create(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXCoordinateForPlateau() {
        String input = "-1 2";
        Plateau.create(input);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testYCoordinateForPlateau() {
        String input = "2 -1";
        Plateau.create(input);
    }
}
