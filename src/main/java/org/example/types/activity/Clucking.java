package org.example.types.activity;

import org.example.types.activity.interfaces.MakingNoise;

public class Clucking implements MakingNoise {
    @Override
    public String apply() {
        return "Clucks!!Clucks!!Clucks!!";
    }
}
