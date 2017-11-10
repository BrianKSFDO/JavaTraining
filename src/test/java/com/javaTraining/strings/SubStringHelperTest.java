package com.javaTraining.strings;

import org.junit.*;

/**
 * Created by Brian on 10/10/2017.
 */
public class SubStringHelperTest {

    SubStringHelper helper;

    @BeforeClass
    public static void beforeClass() {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
    }

    @Before
    public void setup() {
//        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
//        System.out.println(testNameLocal);
        helper = new SubStringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        String actual = helper.truncateAInFirst2Positions("AACD");
        String expected = "CD";
        Assert.assertEquals(actual, expected);
        // Or
        Assert.assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions2(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        Assert.assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testAreFirstAndLast2CharsTheSame_BasicNegativeScenario(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        Assert.assertEquals(false, helper.areFirstAndLast2CharsTheSame("ABCD"));
        Assert.assertFalse(helper.areFirstAndLast2CharsTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLast2CharsTheSame_BasicPositiveScenario(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        Assert.assertEquals(true, helper.areFirstAndLast2CharsTheSame("ABABABAB"));
        Assert.assertTrue(helper.areFirstAndLast2CharsTheSame("ABAB"));
    }

    @After
    public void teardown(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
    }

    @AfterClass
    public static void afterClass(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
    }

}