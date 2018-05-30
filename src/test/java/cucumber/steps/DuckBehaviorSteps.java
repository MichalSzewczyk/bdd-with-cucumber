package cucumber.steps;

import com.zoo.di.ApplicationConfiguration;
import com.zoo.ducks.application.Duck;
import com.zoo.ducks.ports.Output;
import cucumber.AdaptersConfiguration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.utils.DuckDriver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuckBehaviorSteps {
    private DuckDriver duckDriver = new DuckDriver();
    private AnnotationConfigApplicationContext applicationContext;

    @Given("^all dependencies injected$")
    public void allDependenciesInjected() {
        applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AdaptersConfiguration.class);
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();
    }

    @Given("^there is a duck$")
    public void thereIsADuck() {
        Duck duck = applicationContext.getBean(Duck.class);
        duckDriver.setDuck(duck);
    }

    @When("^duck is asked to quack$")
    public void duckIsAskedToQuack() {
        duckDriver.makeDuckQuack();
    }

    @Then("^duck no quack$")
    public void duckNoQuack() {
        duckDriver.verifyDuckNotQuacked();
    }

    @And("^test driver configured$")
    public void testDriverConfigured() throws Throwable {
        duckDriver.setOutput(applicationContext.getBean(Output.class));
    }
}
