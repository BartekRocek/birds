package org.example.types;

import org.example.Bird;
import org.example.types.activity.Whistling;

public class Whistle extends Bird {

    public Whistle() {
        System.out.println("\nA whistle does it like that:");
        makingNoise = new Whistling();
    }
}
