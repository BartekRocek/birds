package org.example.types.activity;

import org.example.types.activity.interfaces.MakingNoise;

public class Whistling implements MakingNoise {

    @Override
    public String apply() {
        return "Whiiiiistle!Whiiiiistle!Whiiiiistle!Whiiiiistle!";
    }
}
