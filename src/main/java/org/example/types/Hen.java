package org.example.types;

import org.example.Bird;
import org.example.types.activity.Clucking;
import org.example.types.activity.NoFlying;
import org.example.types.activity.Walking;

public class Hen extends Bird {

    public Hen() {

        System.out.println("\nA hen does it like that:");
        flyingInterface = new NoFlying();
        makingNoiseInterface = new Clucking();
        movingInterface = new Walking();
    }
}
