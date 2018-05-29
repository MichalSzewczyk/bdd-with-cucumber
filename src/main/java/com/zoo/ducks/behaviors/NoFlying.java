package com.zoo.ducks.behaviors;

import com.zoo.output.Output;

public class NoFlying implements FlyingBehavior {
    private final Output output;

    public NoFlying(Output output) {
        this.output = output;
    }

    public void fly() {
        output.print("No flying.");
    }
}
