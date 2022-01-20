package org.lessonHW16;

import org.testng.annotations.Test;

public class TestTwo {

    @Test(groups = "regression")
    public void testCase3() {
        System.out.println("in test case 3");
    }



    @Test(groups = "smoke")
    public void testCase4() {
        System.out.println("in test case 4 (smoke)");
    }

    // test case 2
    @Test(groups = "regression")
    public void testCase5() {
        System.out.println("in test case 5");
    }
}

