package com.euler.app.stepDefinition;

import com.euler.app.Problem2;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

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
}
