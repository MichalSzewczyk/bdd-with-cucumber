package com.zoo.di;

import com.zoo.ducks.Duck;
import com.zoo.ducks.SmallDuck;
import com.zoo.ducks.behaviors.FlyingBehavior;
import com.zoo.ducks.behaviors.NoFlying;
import com.zoo.ducks.behaviors.NoQuacking;
import com.zoo.ducks.behaviors.QuackingBehavior;
import com.zoo.output.Output;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    FlyingBehavior flyingBehavior(Output output) {
        return new NoFlying(output);
    }

    @Bean
    QuackingBehavior quackingBehavior(Output output) {
        return new NoQuacking(output);
    }

    @Bean
    Duck duck(FlyingBehavior flyingBehavior, QuackingBehavior quackingBehavior) {
        return new SmallDuck(flyingBehavior, quackingBehavior);
    }

}
