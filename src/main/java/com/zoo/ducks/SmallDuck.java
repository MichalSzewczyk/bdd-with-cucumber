package com.zoo.ducks;

import com.zoo.ducks.behaviors.FlyingBehavior;
import com.zoo.ducks.behaviors.QuackingBehavior;

public class SmallDuck implements Duck {
    private final FlyingBehavior flyingBehavior;
    private final QuackingBehavior quackingBehavior;

    public SmallDuck(FlyingBehavior flyingBehavior, QuackingBehavior quackingBehavior) {
        this.flyingBehavior = flyingBehavior;
        this.quackingBehavior = quackingBehavior;
    }

    public void fly() {
        this.flyingBehavior.fly();
    }

    public void quack() {
        this.quackingBehavior.quack();
    }

    public String getName() {
        return "Small";
    }
}
