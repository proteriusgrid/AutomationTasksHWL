package com.ex.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private  WebDriver webDriver;
    private By myAccountLink = By.xpath("//a[contains(text(),'My Account')]");


    public MainPage( WebDriver webDriver ) {
        super(webDriver);
    }


    public LoginPage clickOnMyAccountLink(   ){
       findElement(webDriver, myAccountLink).click();
       return new LoginPage(webDriver);
    }


}
