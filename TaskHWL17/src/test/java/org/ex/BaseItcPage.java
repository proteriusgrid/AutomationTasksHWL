package org.ex;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseItcPage extends BaseClass {

    @Test
    public void firstVerify1() {
        driver.get("https://itc.ua/");
        Assert.assertEquals("ITC.ua", driver.getTitle());
    }
    @Test
    public  void TestTwo () {
        driver.get("https://itc.ua/");
        driver.findElement(By.xpath("//header/div[1]/span[1]/span[1]/a[1]/img[1]")).click();

    }

}
