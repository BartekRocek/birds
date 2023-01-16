package org.example.types.activity;

import org.example.types.activity.interfaces.Moving;

public class Lying implements Moving {
    @Override
    public String apply() {
        return "I'm just lying!";
    }
}
