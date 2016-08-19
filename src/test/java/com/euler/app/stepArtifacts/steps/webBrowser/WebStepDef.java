package com.euler.app.stepArtifacts.steps.webBrowser;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by JamAyen on 18/8/2016.
 */
public class WebStepDef {

    WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp(){
    }

    @After("@web")
    public void tearDown(){
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    @Given("^that the web browser is \"([^\"]*)\"$")
    public void thatTheWebBrowser(String webBrowser) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @And("^the user opens website \"([^\"]*)\"$")
    public void theuseropensWebsite(String pageLink) {
        driver.get(pageLink + "/");
    }

    @Then("^user should see \"([^\"]*)\" on the title$")
    public void userShouldSeeOnTheTitle(String pageTitle) {
            assertEquals(pageTitle, driver.getTitle());
    }

    @And("^user clicks the Search input and searches for \"([^\"]*)\"$")
    public void userclicksTheSearchInputAndSearchesFor(String searchCriteria){
        driver.findElement(By.id("searchInput")).click();
        driver.findElement(By.id("searchInput")).clear();
        driver.findElement(By.id("searchInput")).sendKeys(searchCriteria);
        driver.findElement(By.id("searchButton")).click();
    }

    @Then("^user should see \"([^\"]*)\" on the article title$")
    public void userShouldSeeOnTheArticleTitle(String articleTitle) {
        assertEquals(articleTitle, driver.findElement(By.id("firstHeading")).getText());
    }

    @When("^link to \"([^\"]*)\" is clicked$")
    public void linkToIsClicked(String pageLink)  {

        driver.findElement(By.xpath("(//a[contains(text(),'Chinese')])[4]")).click();
    }
}
