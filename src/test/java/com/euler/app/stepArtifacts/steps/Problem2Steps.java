package com.euler.app.stepArtifacts.steps;

import com.euler.app.Problem2;
import com.euler.app.stepArtifacts.models.InputOutput;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

/**
 * Created by JamAyen on 16/8/2016.
 */
public class Problem2Steps {

    Problem2 testObj;
    int maxSequence;

    @Before
    public void setUp(){
        testObj = new Problem2();
        maxSequence = 0;
    }

    @Given("^that we generate fib sequence up to (\\d+) digits$")
    public void thatWeGenerateFibSequenceUpToDigits(int maxSequence) throws Throwable {
        this.maxSequence = maxSequence;
    }

    @Then("^sum of all even numbered sequence will be (\\d+)$")
    public void sumOfAllEvenNumberedSequenceWillBe(int sumOfEvenSequences) throws Throwable {
        Assert.assertEquals(sumOfEvenSequences, testObj.getSumOfFibonacciUnder(maxSequence));
    }

    @When("^the input value then the output should be as below:$")
    public void theInputValueThenTheOutputShouldBeAsBelow(List<InputOutput> inOut) throws Throwable {
        for (InputOutput i:inOut)
        {
            Assert.assertEquals(i.getOutput(), Integer.valueOf(testObj.getSumOfFibonacciUnder(i.getInput())));
        }
    }
}
