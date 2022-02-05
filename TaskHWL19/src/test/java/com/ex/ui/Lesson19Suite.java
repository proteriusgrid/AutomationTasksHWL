package com.ex.ui;

import com.ex.BaseTest;
import com.github.dockerjava.core.MediaType;
import org.apache.hc.core5.http.HttpStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.io.File;
import java.io.InputStream;
import java.util.*;

public class Lesson19Suite extends BaseTest {


    @Test
    public void uploadTestTask1() {
        webDriver.manage().window().maximize();
        webDriver.get("https://theautomationzone.blogspot.com/");
        String buttonUpdateFile = "//input[@id='photo']";

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0, 2500)");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webDriver.findElement(By.xpath(buttonUpdateFile)).click();
        webDriver.findElement(By.xpath(buttonUpdateFile)).sendKeys("src/main/resources/TestText.txt", Keys.ENTER);

        WebElement upload = webDriver.findElement(By.id("photo"));
        upload.sendKeys("C:/task/TestText.txt");
        webDriver.findElement(By.id("TestText.txt")).click();

        String buttonUpdateInputFile = "//input[contains(@class,'input-file')]";
        final File FILE = new File("src/main/resources/TestText.txt");

    }

    @Test
    public void randomeCheckboxTestTask2() {

        String checkboxTable = "//*[@id=\"post-body-7264005679624427339\"]//input";
        webDriver.manage().window().maximize();
        webDriver.get("https://theautomationzone.blogspot.com/");

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0, 2700)");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> links = webDriver.findElements(By.xpath(checkboxTable));
        WebElement random1 = links.get(new Random().nextInt(links.size()));
        random1.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void randomClickTest3() {
        String randomeClickMenuPanel = "//*[@id=\"gk-header-sticky\"]/div[1]/div/div/div[2]/ul/li";
        webDriver.manage().window().maximize();
        webDriver.get("https://www.gurock.com/testrail/");

        List<WebElement> links = webDriver.findElements(By.xpath(randomeClickMenuPanel));

        WebElement random2 = links.get(new Random().nextInt(links.size()));
        random2.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
