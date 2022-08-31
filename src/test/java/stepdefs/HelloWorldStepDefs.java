package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HelloWorldStepDefs {

    private int alexApplesCount;
    private int katApplesCount;
    private int result;

    @Given("Alex have {int} apples")
    public void alex_have_15_apples(int count) {
        alexApplesCount = count;
    }

    @Given("Jekaterina has {int} apples")
    public void jekaterina_has_12_apples(int count) {
        katApplesCount = count;
    }

    @When("they are putting all apples together")
    public void count_apples_together() {
        result = alexApplesCount + katApplesCount;
        System.out.println("Result: " + result);
    }

    @Then("they have {int} apples")
    public void check_apples_count(int count) {
        System.out.println("Checking the results: ");
        Assertions.assertEquals(count,result,"Wrong total count!");
        System.out.println("Result is ok");
    }
}
