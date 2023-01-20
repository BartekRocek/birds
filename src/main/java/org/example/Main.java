package org.example;

import org.example.types.Hen;
import org.example.types.Mallard;
import org.example.types.RubberBird;
import org.example.types.Whistle;
import org.example.types.activity.Colouring;
import org.example.types.activity.Flying;
import org.example.types.activity.NoFlying;
import org.example.types.activity.Quacking;
import org.example.types.activity.Walking;

public class Main {
    public static void main(String[] args) {


        Bird mallard = new Mallard();
        System.out.println(mallard.doFly());
        System.out.println(mallard.doMakeNoise());
        System.out.println(mallard.doMove());

        Bird toyDuck = new RubberBird();
        System.out.println(toyDuck.doFly());
        System.out.println(toyDuck.doMakeNoise());
        System.out.println(toyDuck.doMove());
        System.out.println(toyDuck.doColourBird("black"));

        Bird whistle = new Whistle();
        System.out.println(whistle.doMakeNoise());

        Bird hen = new Hen(new NoFlying(), new Quacking(), new Walking(), new Colouring());
        System.out.println(hen.doFly());
        System.out.println(hen.doMakeNoise());
        System.out.println(hen.doMove());
//        System.out.println(hen.doPosition());

    }
}
