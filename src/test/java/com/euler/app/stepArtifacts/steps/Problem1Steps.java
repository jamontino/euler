package com.euler.app.stepArtifacts.steps;

import com.euler.app.Problem1;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * Created by JamAyen on 16/8/2016.
 */
public class Problem1Steps {
    Problem1 testobject;
    int maxNumber;

    @Before
    public void setUp(){
        testobject = new Problem1();
        maxNumber = 0;
    }

    @Given("^that the maximum number is (\\d+)$")
    public void thatTheMaximumNumberIs(int maxNumber) throws Throwable {
        this.maxNumber = maxNumber;

    }

    @Then("^sum would be (\\d+)$")
    public void sumWouldBe(int sum) throws Throwable {
        Assert.assertEquals(sum,testobject.getSumUsing(maxNumber));
    }

}
