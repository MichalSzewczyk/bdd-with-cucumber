package com.zoo.ducks.behaviors;

import com.zoo.output.Output;

public class NoQuacking implements QuackingBehavior {
    private final Output output;

    public NoQuacking(Output output) {
        this.output = output;
    }

    public void quack() {
        output.print("No quacking.");
    }
}
