package com.javaTraining.utils;

import com.javaTraining.utils.GCD;
import org.junit.*;

/**
 * Created by Brian on 10/3/2017.
 */
public class GCDTest {

    GCD gcd;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class");
    }

    @Before
    public void setUp() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        gcd = new GCD();
    }

    @Test
    public void euclidAlgorithm() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        Assert.assertEquals(18, gcd.euclidAlgorithm(461952, 116298));
        Assert.assertEquals(5, gcd.euclidAlgorithm(10, 25));
        Assert.assertEquals(5, gcd.euclidAlgorithm(25, 10));
        Assert.assertEquals(1, gcd.euclidAlgorithm(2, 3));
        Assert.assertEquals(4, gcd.euclidAlgorithm(0, 4));
        Assert.assertEquals(4, gcd.euclidAlgorithm(4, 0));
        Assert.assertEquals(3, gcd.euclidAlgorithm(3, 3));
        Assert.assertEquals(0, gcd.euclidAlgorithm(0, 0));
    }

    @After
    public void tearDown() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
    }

    @AfterClass
    public static void setUpAfterClass() throws Exception {
        System.out.println("After Class");
    }

}