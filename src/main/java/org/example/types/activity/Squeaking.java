package org.example.types.activity;

import org.example.types.activity.interfaces.MakingNoise;

public class Squeaking implements MakingNoise {
    @Override
    public String apply() {
        return "Squeak!Squeak!Squeak!Squeak!";
    }
}
