package org.lessonHW16;


import org.testng.Assert;
import org.testng.annotations.*;

public class TestOne {


    @DataProvider
    public static Object[][] numberProvider() {
        return new Object[][]{
                {1},
                {2}
        };
    }


    @Test(dataProvider = "numberProvider")
    public void test1( int num ) {
        Assert.assertNotEquals(3, num);
    }





    @BeforeSuite
    public void setUp() {
        System.out.println("before suite");



    }

    @BeforeTest
    public void profileSetup() {
        System.out.println("before test");

    }

    @BeforeClass
    public void appSetup() {

        System.out.println("before class");
    }
//


    @BeforeGroups
    public void beforeGroupsNew() {
        System.out.println("before groups");
    }


    @BeforeMethod
    public void beforeMethodPrecondition() {
        System.out.println("this is before method ");
    }

    @Test(groups = "regression", dataProvider = "numberProvider", priority = 1, enabled =true)
    public void testWorkFirst( int num ) {
        System.out.println("Hello  first test " + num);

        // test case 1

    }

    @Test(groups = "smoke", enabled = false)
    public void testCase1() {
        System.out.println("in test case 1 (smoke)");
    }

    // test case 2
    @Test(groups = "regression")
    public void testCase2() {
        System.out.println("in test case 2");
    }

    @AfterMethod
    public void afterMethodPrecondition() {
        System.out.println("this is after method ");
    }

    @AfterGroups
    public void afterGroupsNew() {
        System.out.println("after groups");
    }




    @AfterSuite
    public void cleanUp() {
        System.out.println("All close up activities completed");
    }


    @AfterTest
    public void reportReady() {
        System.out.println("Report is ready to be shared, with screenshots of tests");
    }


    @AfterClass
    public void closeUp() {
        System.out.println("after class");

    }

}
