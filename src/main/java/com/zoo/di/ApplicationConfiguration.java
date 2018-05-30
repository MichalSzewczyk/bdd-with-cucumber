package com.zoo.di;

import com.zoo.ducks.application.Duck;
import com.zoo.ducks.application.SmallDuck;
import com.zoo.ducks.application.behaviors.FlyingBehavior;
import com.zoo.ducks.application.behaviors.NoFlying;
import com.zoo.ducks.application.behaviors.NoQuacking;
import com.zoo.ducks.application.behaviors.QuackingBehavior;
import com.zoo.ducks.ports.Output;
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
