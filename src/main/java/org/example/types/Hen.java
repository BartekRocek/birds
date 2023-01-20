package org.example.types;

import org.example.Bird;
import org.example.types.activity.Clucking;
import org.example.types.activity.NoFlying;
import org.example.types.activity.Walking;
import org.example.types.activity.interfaces.Colour;
import org.example.types.activity.interfaces.Flying;
import org.example.types.activity.interfaces.MakingNoise;
import org.example.types.activity.interfaces.Moving;

public class Hen extends Bird {


    public Hen(Flying flying, MakingNoise makingNoise, Moving moving, Colour colour) {
        System.out.println("\nA hen does it like that:");
        this.flying = flying;
        this.makingNoise = makingNoise;
        this.moving = moving;
        this.colour = colour;
    }

//    public Hen() {
//        flying = new NoFlying();
//        makingNoise = new Clucking();
//        moving = new Walking();
//    }
}
