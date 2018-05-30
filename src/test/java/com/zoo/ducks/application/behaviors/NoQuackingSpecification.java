package com.zoo.ducks.application.behaviors;

import com.zoo.ducks.ports.Output;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NoQuackingSpecification {
    @Test
    public void shouldPrintNoQuackingMessageToOutputWhenQuacking() {
        // GIVEN
        Output output = mock(Output.class);
        QuackingBehavior behavior = new NoQuacking(output);

        // WHEN
        behavior.quack();

        // THEN
        verify(output).print("No quacking.");
    }
}