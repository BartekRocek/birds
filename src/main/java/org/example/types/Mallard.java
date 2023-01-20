package org.example.types;

import org.example.Bird;
import org.example.types.activity.Flying;
import org.example.types.activity.Quacking;
import org.example.types.activity.Walking;

public class Mallard extends Bird {

    public Mallard() {

        System.out.println("\nA mallard does it this way");
        flying = new Flying();
        makingNoise = new Quacking();
        moving = new Walking();
    }
}
