package com.ex.ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest  {
    protected static WebDriver webDriver;



    @BeforeClass
    public void  setUp(){
        webDriver= WebDriverManagerClass.getWebDriver();

    }
    @AfterClass
    public void shutDown(){
        webDriver.quit();
    }

    public void scrollToElement(WebDriver webDriver, WebElement webElement){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true)", webElement);

    }
}
