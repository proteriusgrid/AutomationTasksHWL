package com.ex.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestRunPage extends BasePage{



    private By emailField = By.xpath("//input[@id='name']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[contains(.,'Log In')]");

    private By testRunTitle = By.xpath("//*[@id=\"project-1\"]/div[2]/div[1]/a");
    private By navigationTestRun =By.xpath("//*[@id=\"navigation-runs\"]");

    private By firstLinkTestRun = By.xpath("//a[contains(text(),'Test Run 3/19/2022')][1]");


    private By testCaseOneTenLink = By.xpath("//table[@id=\"grid-1\"]//tr[@id=\"row-1\"]/td[3]/a");
    private By addResultButton = By.xpath("//*[@id=\"addResult\"]");

    private By addResultStatus = By.xpath("//*[@id=\"addResultStatus_chzn\"]/a/div/b");
    private  By addResultStatus_chzn_o_3= By.xpath("//ul[@class='chzn-results']//li[@id='addResultStatus_chzn_o_3']");
    private  By toClickOnAddResultSubmitButton = By.xpath("//div[@class=\"change-container\"]//div[@class=\"table\"]/div[1]//span");

    private  By dynamicElementAddResultStatus = By.xpath("//ul[@class='chzn-results']//li[@id='addResultStatus_chzn_o_3']");
    private By addResultSubmitButton = By.xpath("//*[@id=\"addResultSubmit\"]");
    private By toStutusOfRunTestCase = By.xpath("//div[@class=\"change top\"]/div/div[1]/div/span");


    public TestRunPage( WebDriver webDriver ) {
        super(webDriver);
    }

    public TestRunPage( WebDriver webDriver, String s ) {
        super(webDriver);
    }

    public TestRunPage inputEmail( String email ) {

        findElement(webDriver, emailField).sendKeys(email);
        return this;
    }

    public TestRunPage inputPassword( String password ) {
        findElement(webDriver, passwordField).sendKeys(password);
        return this;
    }

    public TestRunPage clickOnLoginButton() {
        findElement(webDriver, loginButton).click();
        return this;
    }

    public TestRunPage clickOnTestRunTitle( ){
        findElement(webDriver, testRunTitle).click();
        return new TestRunPage(webDriver);
    }

    public TestRunPage clickOnNavigationTestRun() {
        findElement(webDriver, navigationTestRun).click();
        return this;
    }
    public TestRunPage clickOnFirstLinkTestRun() {
        findElement(webDriver, firstLinkTestRun).click();
        return this;
    }
    public TestRunPage clickOnTestCaseOneTenLink() {
        findElement(webDriver, testCaseOneTenLink).click();
        return this;
    }

    public TestRunPage clickOnAddResultButton() {
        findElement(webDriver, addResultButton).click();
        return this;
    }
    public TestRunPage clickStatusSelectorPanel() {


        findElement(webDriver, addResultStatus).click();
        WebElement dynamicElement = (new WebDriverWait(webDriver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(dynamicElementAddResultStatus));

        findElement(webDriver, addResultStatus_chzn_o_3).click();


        return this;
    }

    public TestRunPage clickOnAddResultSubmitButton() {
        findElement(webDriver, addResultSubmitButton).click();
        return this;
    }

    public TestRunPage verifySpanStutus(){

        new WebDriverWait(webDriver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(toStutusOfRunTestCase));

        Assert.assertEquals(findElement(webDriver,toStutusOfRunTestCase)
                .getText(), "Failed");

        return this;
    }

}
