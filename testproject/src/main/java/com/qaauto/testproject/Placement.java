package com.qaauto.testproject;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;

public class Placement {
    List<Rover> roversList;

    Plateau plateau;

    public Placement(List<Rover> RoversList, Plateau plateau) {

        this.roversList = RoversList;
        this.plateau = plateau;
    }

    public void placeRover(Plateau plateau2, Rover rover2) {
        Rectangle plateauCoord = plateau2.getCoordinates();
        Point roverLandingPosCoor = rover2.getPosition();
        if (checkRoverPositionOnPlateau(plateauCoord, roverLandingPosCoor)) {

        }
    }

    private boolean checkRoverPositionOnPlateau(Rectangle plateauCoord, Point roverLandingPosCoor) {
//    if (plateauCoord.x >=roverLandingPosCoor.x)&&(plateauCoord.y >=roverLandingPosCoor.y)&&(isPositionAvailable(roversList)){
        
//    }
    return false;
}

    private boolean isPositionAvailable(List<Rover> roversList2) {
        Set<Integer> setOfX = new HashSet<Integer>();
        Set<Integer> setOfY = new HashSet<Integer>();
        
        
        for (Rover a : roversList2)
            if (!setOfX.add(a.getPosition().x) && !setOfY.add(a.getPosition().y)){
                            


        }
            return false;
    }

}
