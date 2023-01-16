package org.example.types.activity;

import org.example.types.activity.interfaces.MakingNoise;

public class Quacking implements MakingNoise {
    @Override
    public String apply() {
        return "Quack!Quack!Quack!Quack!";
    }
}
