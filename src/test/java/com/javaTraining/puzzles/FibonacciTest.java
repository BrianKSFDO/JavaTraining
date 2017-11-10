package com.javaTraining.puzzles;

import org.junit.*;

/**
 * Created by Brian on 10/15/2017.
 */
public class FibonacciTest {

    Fibonacci helper;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
    }

    @Before
    public void setup() {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        helper = new Fibonacci();
    }

    @Test
    public void testValidInt(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);

//		Assert.assertFalse("Wrong", "j".equals(helper.fibonacci(5)));
    }

    @Test
    public void testHappyPath(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);

        helper.getFibonacci(0);
        System.out.println("0th position in Fibonacci sequence is " + helper.getFibonacci(0));
        helper.getFibonacci(2);
        System.out.println("2nd position in Fibonacci sequence is " + helper.getFibonacci(2));
        helper.getFibonacci(4);
        System.out.println("4th position in Fibonacci sequence is " + helper.getFibonacci(4));
        helper.getFibonacci(6);
        System.out.println("6th position in Fibonacci sequence is " + Fibonacci.getFibonacci(6));

        Assert.assertEquals(0, helper.getFibonacci(0));
        Assert.assertEquals(1, helper.getFibonacci(2));
        Assert.assertEquals(3, helper.getFibonacci(4));
        Assert.assertEquals(8, helper.getFibonacci(6));
    }

    @Test
    public void testNegativePath(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);

        Assert.assertFalse("Wrong", 4==helper.getFibonacci(5));
        Assert.assertFalse("Wrong", 6==helper.getFibonacci(5));
    }

    @After
    public void teardown(){
        System.out.println("teardown");
    }

    @AfterClass
    public static void afterClass(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
    }



}