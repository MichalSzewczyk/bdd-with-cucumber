package cucumber.utils;

import com.zoo.ducks.application.Duck;
import com.zoo.ducks.ports.Output;

import static org.mockito.Mockito.verify;

public class DuckDriver {
    private Duck duck;
    private Output output;

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public void makeDuckQuack() {
        duck.quack();
    }

    public void verifyDuckNotQuacked() {
        verify(output).print("No quacking.");
    }
}
