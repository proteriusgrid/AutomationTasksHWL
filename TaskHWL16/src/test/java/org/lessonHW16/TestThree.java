package org.lessonHW16;

import org.testng.annotations.Test;

public class TestThree {

    @Test(groups = "regression")
    public void testCase6() {
        System.out.println("in test case 6");
    }
    // test case 1


    @Test(groups = "smoke")
    public void testCase7() {
        System.out.println("in test case 7 (smoke)");
    }

    // test case 2
    @Test(groups = "regression")
    public void testCase8() {
        System.out.println("in test case 8");
    }

}
