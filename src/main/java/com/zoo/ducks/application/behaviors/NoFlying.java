package com.zoo.ducks.application.behaviors;

import com.zoo.ducks.ports.Output;

public class NoFlying implements FlyingBehavior {
    private final Output output;

    public NoFlying(Output output) {
        this.output = output;
    }

    public void fly() {
        output.print("No flying.");
    }
}
