package org.example;

import org.example.types.activity.interfaces.Colour;
import org.example.types.activity.interfaces.Flying;
import org.example.types.activity.interfaces.MakingNoise;
import org.example.types.activity.interfaces.Moving;

public abstract class Bird {

    public Flying flyingInterface;
    public MakingNoise makingNoiseInterface;
    public Moving movingInterface;
    public Colour makeColourInterface;

    public String doFly() {
        return flyingInterface.apply();
    }

    public String doMakeNoise() {
        return makingNoiseInterface.apply();
    }

    public String doMove() {
        return movingInterface.apply();
    }
    public String doColourBird(String colour) {
        return makeColourInterface.apply(colour);
    }

}
