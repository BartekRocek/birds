package org.example.types;

import org.example.Bird;
import org.example.types.activity.Colouring;
import org.example.types.activity.Lying;
import org.example.types.activity.NoFlying;
import org.example.types.activity.Squeaking;


public class RubberBird extends Bird {

    public RubberBird() {

        System.out.println("\nA toy duck does it that way");
        flyingInterface = new NoFlying();
        makingNoiseInterface = new Squeaking();
        movingInterface = new Lying();
        makeColourInterface = new Colouring();

    }
}
