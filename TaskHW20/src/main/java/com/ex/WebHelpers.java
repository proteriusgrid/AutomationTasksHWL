package com.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebHelpers {
    long timeOut = 10L;

    public WebElement findElement( WebDriver webDriver, By locator ) {
        return  findElement(webDriver, locator , timeOut);


    }

    public WebElement findElement( WebDriver webDriver, By locator, Long timeOut ) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));


    }
    public WebElement waitForElementClickable( WebDriver webDriver, By locator ) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void scrollToElement(WebDriver webDriver, WebElement webElement){
//        WebElement l=webDriver.findElement(By.xpath("//h3[contains(.,'Company')]"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true)", webElement);
//        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true)", l);

    }

}
