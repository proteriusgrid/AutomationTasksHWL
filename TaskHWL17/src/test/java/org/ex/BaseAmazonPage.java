package org.ex;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseAmazonPage extends BaseClass{
    @Test
    public void firstVerify1() {
        driver.get("https://www.amazon.com");
        driver.navigate().refresh();
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
    }

    @Test
    public  void  testTwo(){
//        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).click();


    }
}
