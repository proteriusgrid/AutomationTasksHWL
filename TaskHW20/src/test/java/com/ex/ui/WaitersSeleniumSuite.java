package com.ex.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class WaitersSeleniumSuite extends BaseTest {


//    public WebDriver findElement(WebDriver, webDriver,By locator){
//        return  new WebDriverWait(webDriver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }

    @Test
    public void threadSleep() {

        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        webDriver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("someemail@email.com");

//        webDriver.findElement(webDriver,By.xpath("//button[@id='SubmitCreate']")).sendKeys("someemail@email.com");
//        webDriver.findElement(webDriver,By.xpath("//button[@id='SubmitCreate']")).click();

        webDriver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
//        webDriver.findElement(webDriver,By.xpath("//button[@id='SubmitCreate']"), 10L).click();
//        webDriver.findElement(By.xpath("//button[@id='submitAccount']")).isDisplayed();
//        boolean isD =waitForElementClickable(webDriver,By.xpath("//button[@id='SubmitCreate']")).isDisplayed();


//        WebDriver wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submitAccount']"))).click();

//        Wait<WebDriver> wait = new FluentWait<>(webDriver)
//                .withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submitAccount']"))).click();

//        try{
//            Thread.sleep(4000);
//        }catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

    @Test
    public void testScrolling() {
        webDriver.get("https://www.gurock.com/testrail/");
        WebElement we = webDriver.findElement(By.xpath("//a[contains(.,'Legal')]"));
        scrollToElement(webDriver, we);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        findElement(webDriver, By.xpath("//a[@id='ui-id-3']")).click();
        System.out.println();
    }


    @Test
    public void testScrollingAboutGurock() {

        String footerMenuAboutGurock = "//a[contains(.,'About Gurock')]";
        String h1TextOurStory = "//h1[contains(.,'Our Story')]";

        webDriver.get("https://www.gurock.com/testrail/");
        WebElement webElement1 = findElement(webDriver, By.xpath(footerMenuAboutGurock));
        scrollToElement(webDriver, webElement1);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElement(webDriver, By.xpath(footerMenuAboutGurock)).click();


        Assert.assertTrue(webDriver.findElement(By.xpath(h1TextOurStory))
                .getText().equals("Our Story"));

        System.out.println();
    }

    @Test
    public void testScrollingJobs() {
        String footerMenuJobs = "//a[contains(.,'Jobs')]";
        String h1TextHelpUsBuild = "//h1[contains(.,'Help us build products thousands of teams love')]";

        webDriver.get("https://www.gurock.com/testrail/");
        WebElement webElement2 = webDriver.findElement(By.xpath(footerMenuJobs));
        scrollToElement(webDriver, webElement2);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElement(webDriver, By.xpath(footerMenuJobs)).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(webDriver.findElement(By.xpath(h1TextHelpUsBuild))
                .getText().equals("Help us build products thousands of teams love"));
        System.out.println();
    }

    @Test
    public void testScrollingContact() {

        String footerMenuContact = "//*[@id=\"menu-item-706\"]/a";
        String h1TextContact = "//h1[contains(.,'Contact the TestRail Team')]";

        webDriver.get("https://www.gurock.com/testrail/");
        WebElement webElement3 = webDriver.findElement(By.xpath(footerMenuContact));
        scrollToElement(webDriver, webElement3);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElement(webDriver, By.xpath(footerMenuContact)).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(webDriver.findElement(By.xpath(h1TextContact))
                .getText().equals("Contact the TestRail Team"));
        System.out.println();
    }

    @Test
    public void testScrollingCompliance() {
        String footerMenuCompliance = "//a[contains(.,'Compliance')]";
        String h1TextTestRailSOC2 = "//h1[contains(.,'TestRail SOC 2 Compliance & Certification')]";

        webDriver.get("https://www.gurock.com/testrail/");
        WebElement webElement4 = webDriver.findElement(By.xpath(footerMenuCompliance));
        scrollToElement(webDriver, webElement4);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElement(webDriver, By.xpath(footerMenuCompliance)).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(webDriver.findElement(By.xpath(h1TextTestRailSOC2))
                .getText().equals("TestRail SOC 2 Compliance & Certification"));
        System.out.println();
    }

    @Test
    public void testScrollingLegal() {

        String footerMenuLegal = "//a[contains(.,'Legal')]";

        String clickTablePoliciesProcedures = "//*[@id=\"ui-id-3\"]";
        String checkTextDataStoragePolicy = "//a[contains(.,'Data Storage Policy')]";

        String buttonSubscribe = "//div[@class='col-sm-12 gk-footer-social-newsletter']/a";
        String h1TextSubscribeToTestRail = "//h1[contains(text(),'Subscribe to TestRail News')]";

        webDriver.get("https://www.gurock.com/testrail/");

        WebElement webElement5 = webDriver.findElement(By.xpath(footerMenuLegal));
        scrollToElement(webDriver, webElement5);

        String tb = Keys.chord(Keys.CONTROL, Keys.ENTER);
        findElement(webDriver, By.xpath(footerMenuLegal)).sendKeys(tb);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> tabs1 = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs1.get(1));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElement(webDriver, By.xpath(clickTablePoliciesProcedures)).click();
        Assert.assertTrue(webDriver.findElement(By.xpath(checkTextDataStoragePolicy)).getText().equals("Data Storage Policy"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> tabs2 = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs2.get(0));

        WebElement webElement6 = webDriver.findElement(By.xpath(buttonSubscribe));
        scrollToElement(webDriver, webElement6);
        findElement(webDriver, By.xpath(buttonSubscribe)).click();
        Assert.assertTrue(webDriver.findElement(By.xpath(h1TextSubscribeToTestRail)).getText().equals("Subscribe to TestRail News"));
    }

}
