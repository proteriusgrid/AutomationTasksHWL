package com.ex.ui;

import com.ex.ui.pages.LoginPage;
import com.ex.ui.pages.MainPage;
import com.ex.ui.pages.TestCasePage;
import com.ex.ui.pages.TestRunPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestRailSuite extends BaseTest {

    @Test
    public void testCaseOne() {

        new LoginPage(webDriver, "https://qa2tester155.testrail.io/index.php?/auth/login/")
                .inputEmail("qa2tester15@mailforspam.com")
                 .inputPassword("z5znGT3tYXzGkAMJhZOb")
                .clickOnloginButton();

        new TestCasePage(webDriver)
                .waitForSpecTime(2000)
                .clickOnTestCaseLink()
                .clickOnButtonAddTestCase()
                .titleByField("Test Case One13")
                .clickOnChoiceType()
                .selectOnChoiceType()
                .inputTextInPreconditions("qwerty Test1")
                .inputTextInSteps("qwerty Test2")
                .inputTextInExpectedResults("qwerty Test3")
                .clickOnButtonPageAddTestCase()
                .verifyTheText();

    }

    @Test
    public void testRunTwo() {
        new LoginPage(webDriver, "https://qa2tester155.testrail.io/index.php?/auth/login/")
                .inputEmail("qa2tester15@mailforspam.com")
                .inputPassword("z5znGT3tYXzGkAMJhZOb")
                .clickOnloginButton();

        new TestRunPage(webDriver)
                .clickOnTestRunTitle()
                .clickOnNavigationTestRun()
                .clickOnFirstLinkTestRun()
                .clickOnTestCaseOneTenLink()
                .clickOnAddResultButton()
                .clickStatusSelectorPanel()
                .clickOnAddResultSubmitButton()
                .verifySpanStutus();

    }


}
