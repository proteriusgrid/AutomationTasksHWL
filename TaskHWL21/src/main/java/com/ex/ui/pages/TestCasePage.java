package com.ex.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestCasePage extends BasePage {


    private  By emailField = By.xpath("//input[@id='name']");
    private By passwordField = By.xpath("//input[@id='password']");

    private By loginButton = By.xpath("//button[contains(.,'Log In')]");

    private  By testCaseLink = By.xpath("//a[@class='link'][contains(.,'Test Cases')]");

    private  By buttonAddTestCase = By.xpath("//*[@id=\"sidebar-cases-add\"]/span");

    private By sendTitleByField =By.xpath("//*[@id=\"title\"]") ;

    private  By choiceType = By.xpath("//div[@id='type_id_chzn']/a/div/b");


    private  By selectType = By.xpath("//*[@id='type_id_chzn']/div/ul//li[@id='type_id_chzn_o_2']");
    private By preconditionsField = By.xpath("//*[@id=\"custom_preconds_display\"]");

    private  By stepsField =By.xpath("//*[@id=\"custom_steps_display\"]") ;
    private By expectedResultsField =By.xpath("//*[@id=\"custom_expected_display\"]") ;

    private  By buttonPageAddTestCase = By.xpath("//*[@id=\"accept\"]");


    private  By verifyToFinalText = By.xpath("//div[@class='message message-success']");

    public TestCasePage( WebDriver webDriver ) {
        super(webDriver);
    }


    public TestCasePage openURL(String url) {
        webDriver.get(url);
        return this;
    }

    public TestCasePage inputEmail( String email ) {
        findElement(webDriver, emailField).click();
        findElement(webDriver, emailField).sendKeys(email);
        return this;
    }

    public TestCasePage inputPassword( String password ) {
        findElement(webDriver, passwordField).sendKeys(password);
        return this;
    }

    public TestCasePage clickOnloginButton() {
        findElement(webDriver, loginButton).click();
        return this;
    }

public TestCasePage waitForSpecTime(int miliSeconds) {
    try {
        Thread.sleep(miliSeconds);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    return this;
}

    public TestCasePage clickOnTestCaseLink(   ){
        findElement(webDriver, testCaseLink).click();
        return new TestCasePage(webDriver);
    }
    public TestCasePage clickOnButtonAddTestCase() {
        findElement(webDriver, buttonAddTestCase).click();
        return this;
    }
    public TestCasePage titleByField( String title ) {
        findElement(webDriver, sendTitleByField).sendKeys(title);
        return this;
    }
    public TestCasePage clickOnChoiceType() {
        findElement(webDriver, choiceType).click();
        return this;
    }

    public TestCasePage selectOnChoiceType() {
        findElement(webDriver, selectType).click();

        return this;
    }

    public TestCasePage inputTextInPreconditions( String textInPreconditions ) {
        findElement(webDriver, preconditionsField).sendKeys(textInPreconditions);
        return this;
    }

    public TestCasePage inputTextInSteps( String textInSteps ) {
        findElement(webDriver, stepsField).sendKeys(textInSteps);
        return this;
    }
    public TestCasePage inputTextInExpectedResults( String textInExpectedResults ) {
        findElement(webDriver, expectedResultsField).sendKeys(textInExpectedResults);
        return this;
    }
    public TestCasePage clickOnButtonPageAddTestCase() {
        findElement(webDriver, buttonPageAddTestCase).click();
        return this;
    }

    public TestCasePage verifyTheText() {


        Assert.assertTrue(webDriver.findElement(verifyToFinalText)
                .getText().equals("Successfully added the new test case. Add another"));

        return this;
    }
}

