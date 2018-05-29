package cucumber.utils;

import com.zoo.ducks.Duck;
import com.zoo.output.Output;

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
