package com.zoo.ducks.behaviors;

import com.zoo.output.Output;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NoFlyingSpecification {
    @Test
    void shouldPrintNoFlyingMessageToOutput() {
        // GIVEN
        Output output = mock(Output.class);
        FlyingBehavior behavior = new NoFlying(output);

        // WHEN
        behavior.fly();

        // THEN
        verify(output).print("No flying.");
    }
}