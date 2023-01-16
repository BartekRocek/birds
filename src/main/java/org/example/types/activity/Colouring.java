package org.example.types.activity;

import org.example.types.activity.interfaces.Colour;

public class Colouring implements Colour<String> {

    @Override
    public String apply(String colour) {
        return "The toy is " + colour;
    }
}
