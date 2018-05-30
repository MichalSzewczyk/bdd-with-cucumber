package com.zoo.ducks.application.behaviors;

import com.zoo.ducks.ports.Output;

public class NoQuacking implements QuackingBehavior {
    private final Output output;

    public NoQuacking(Output output) {
        this.output = output;
    }

    public void quack() {
        output.print("No quacking.");
    }
}
