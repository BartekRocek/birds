package org.example.types.activity;

import org.example.types.activity.interfaces.Flying;

public class NoFlying implements Flying {

    @Override
    public String apply() {
        return "I'm not flying at all";
    }
}
