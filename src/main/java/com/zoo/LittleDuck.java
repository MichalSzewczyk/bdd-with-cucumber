package com.zoo;

public class LittleDuck implements Duck {
    private final FlyingBehavior flyingBehavior;
    private final QuackingBehavior quackingBehavior;

    public LittleDuck(FlyingBehavior flyingBehavior, QuackingBehavior quackingBehavior) {
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
        return "Little";
    }
}
