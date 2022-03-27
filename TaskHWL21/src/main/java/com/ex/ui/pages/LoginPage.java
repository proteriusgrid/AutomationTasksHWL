package com.ex.ui.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By emailField = By.xpath("//input[@id='name']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[contains(.,'Log In')]");


    public LoginPage( WebDriver webDriver ) {
        super(webDriver);

    }

    public LoginPage(WebDriver webDriver, String url) {
        super(webDriver, url);
    }

    public LoginPage inputEmail( String email ) {

        findElement(webDriver, emailField).sendKeys(email);
        return this;
    }

    public LoginPage inputPassword( String password ) {
        findElement(webDriver, passwordField).sendKeys(password);
        return this;
    }

    public LoginPage clickOnloginButton() {
        findElement(webDriver, loginButton).click();
        return this;
    }

    public LoginPage verifyPasswordFieldEmpty() {

        boolean isPasswordFieldEmpty = findElement(webDriver, passwordField).getAttribute("value").isEmpty();
        Assertions.assertThat(isPasswordFieldEmpty).as("Password field should be an empty").isTrue();
        return this;
    }
}
