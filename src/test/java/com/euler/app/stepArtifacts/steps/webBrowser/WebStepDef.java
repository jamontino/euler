package com.euler.app.stepArtifacts.steps.webBrowser;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by JamAyen on 18/8/2016.
 */
public class WebStepDef {


    WebDriver driver;
    WebDriverWait wait;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() {
    }

    @After("@web")
    public void tearDown() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    @Given("^that the web browser is \"([^\"]*)\"$")
    public void thatTheWebBrowser(String webBrowser) throws Exception {
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), getDesiredCapabilitiesFor(webBrowser.toLowerCase()));
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    private DesiredCapabilities getDesiredCapabilitiesFor(String webBrowser) {
        DesiredCapabilities capa = new DesiredCapabilities();

        if (webBrowser.equals("chrome")) {
            capa.setBrowserName(webBrowser);
        }

        if (webBrowser.equals("firefox")) {
            capa = DesiredCapabilities.firefox();
            capa.setCapability("marionette",true);
        }

        return capa;
    }

    @And("^the user opens website \"([^\"]*)\"$")
    public void theuseropensWebsite(String pageLink) {
        driver.get(pageLink + "/");
    }

    @Then("^user should see \"([^\"]*)\" on the title$")
    public void userShouldSeeOnTheTitle(String pageTitle) {
        wait.until(ExpectedConditions.titleContains(pageTitle));
        assertEquals(pageTitle, driver.getTitle());
    }

    @And("^user clicks the Search input and searches for \"([^\"]*)\"$")
    public void userclicksTheSearchInputAndSearchesFor(String searchCriteria) {
        driver.findElement(By.id("searchInput")).click();
        driver.findElement(By.id("searchInput")).clear();
        driver.findElement(By.id("searchInput")).sendKeys(searchCriteria);
        driver.findElement(By.id("searchButton")).click();
    }

    @Then("^user should see \"([^\"]*)\" on the article title$")
    public void userShouldSeeOnTheArticleTitle(String articleTitle) {
        wait.until(ExpectedConditions.titleContains(articleTitle));
        assertEquals(articleTitle, driver.findElement(By.id("firstHeading")).getText());
    }

    @When("^the fourth link to Chinese is clicked$")
    public void linkToIsClicked() {
        driver.findElement(By.xpath("(//a[contains(text(),'Chinese')])[4]")).click();
    }
}
