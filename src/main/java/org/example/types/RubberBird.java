package org.example.types;

import org.example.Bird;
import org.example.types.activity.Colouring;
import org.example.types.activity.Lying;
import org.example.types.activity.NoFlying;
import org.example.types.activity.Squeaking;


public class RubberBird extends Bird {

    public RubberBird() {

        System.out.println("\nA toy duck does it that way");
        flying = new NoFlying();
        makingNoise = new Squeaking();
        moving = new Lying();
        colour = new Colouring();

    }
}
