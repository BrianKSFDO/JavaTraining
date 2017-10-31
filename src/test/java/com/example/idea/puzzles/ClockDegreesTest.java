package com.example.idea.puzzles;

import com.example.idea.Person;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Brian on 10/15/2017.
 */
public class ClockDegreesTest {

    ClockDegrees helper;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class");
    }

    @Before
    public void setUp() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        helper = new ClockDegrees();
    }

    @Test
    public void emptyTest() {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
    }

    @Test
    public void testHappyPath() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);

        helper.calcClockAngle(3, 15);
        System.out.println("Degrees difference in clock " + helper.calcClockAngle(3, 15));
        Assert.assertEquals(7.5, helper.calcClockAngle(3, 15), 0);

        helper.calcClockAngle(12, 30);
        System.out.println("Degrees difference in clock " + helper.calcClockAngle(12, 30));
        Assert.assertEquals(165, helper.calcClockAngle(12, 30), 0);

        helper.calcClockAngle(3, 30);
        System.out.println("Degrees difference in clock " + helper.calcClockAngle(3, 30));
        Assert.assertEquals(75, helper.calcClockAngle(3, 30), 0);

//        helper.calcClockAngle(1, 45);
//        System.out.println("Degrees difference in clock " + helper.calcClockAngle(1, 45));
//        Assert.assertEquals(142.5, helper.calcClockAngle(1, 45), 1);

//        helper.calcClockAngle(01, 45);
//        System.out.println("Degrees difference in clock " + helper.calcClockAngle(01, 45));
//        Assert.assertEquals(142.5, helper.calcClockAngle(01, 45), 1);

        helper.calcClockAngle(12, 00);
        System.out.println("Degrees difference in clock " + helper.calcClockAngle(12, 00));
        Assert.assertEquals(0, helper.calcClockAngle(12, 00), 0);

        helper.calcClockAngle(1, 05);
        System.out.println("Degrees difference in clock " + helper.calcClockAngle(1, 05));
        Assert.assertEquals(2.5, helper.calcClockAngle(1, 05), 0);

        helper.calcClockAngle(1, 5);
        System.out.println("Degrees difference in clock " + helper.calcClockAngle(1, 5));
        Assert.assertEquals(2.5, helper.calcClockAngle(1, 5), 0);

        helper.calcClockAngle(01, 05);
        System.out.println("Degrees difference in clock " + helper.calcClockAngle(01, 05));
        Assert.assertEquals(2.5, helper.calcClockAngle(01, 05), 0);
    }

    @Test
    public void calcClockAngle() throws Exception {
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