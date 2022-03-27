package com.ex.ui;

import com.ex.DriverInit;
import com.ex.WebHelpers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest extends WebHelpers {
    protected static WebDriver webDriver;

    @BeforeClass
    public void initWebDriver() {
//        String browser = System.getProperty("browser");
        String browser = System.getProperty("browser", "chrome");
//        String browser = "chrome";
        switch (browser) {
            case "chrome":
                webDriver = DriverInit.getWebDriver(DriverInit.Browser.CHROME);
                break;
            case "ff":
                webDriver = DriverInit.getWebDriver(DriverInit.Browser.FF);
                break;
            default:
                System.err.println("You have to chose from 'chrome' and 'ff'");
        }
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    @AfterClass
    public void closeWebDriwer() {
        webDriver.quit();
    }
}
