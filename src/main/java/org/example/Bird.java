package org.example;

import org.example.types.activity.interfaces.Colour;
import org.example.types.activity.interfaces.Flying;
import org.example.types.activity.interfaces.MakingNoise;
import org.example.types.activity.interfaces.Moving;

public abstract class Bird {

    public Flying flying;
    public MakingNoise makingNoise;
    public Moving moving;
    public Colour colour;


    public String doFly() {
        return flying.apply();
    }

    public String doMakeNoise() {
        return makingNoise.apply();
    }

    public String doMove() {
        return moving.apply();
    }
    public String doColourBird(String rgb) {
        return colour.apply(rgb);
    }

}
