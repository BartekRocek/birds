package org.example.types;

import org.example.Bird;
import org.example.types.activity.Flying;
import org.example.types.activity.Quacking;
import org.example.types.activity.Walking;

public class Mallard extends Bird {

    public Mallard() {

        System.out.println("\nA mallard does it this way");
        flyingInterface = new Flying();
        makingNoiseInterface = new Quacking();
        movingInterface = new Walking();
    }
}
