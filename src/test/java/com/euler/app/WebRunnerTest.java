package com.euler.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by JamAyen on 16/8/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"json:target/ProblemRunnerResults.json"},
    features = "src/test/resources/features/",
    tags = "@web",
    glue = "com.euler.app.stepArtifacts"
)
public class WebRunnerTest {
}
