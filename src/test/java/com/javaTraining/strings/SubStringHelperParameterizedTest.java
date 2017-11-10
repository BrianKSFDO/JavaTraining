package com.javaTraining.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Brian on 10/10/2017.
 */
@RunWith(Parameterized.class)
public class SubStringHelperParameterizedTest {

    SubStringHelper helper;
    private String input;
    private String expectedOutput;

    @BeforeClass
    public static void beforeClass(){
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
    }

    @Before
    public void setup(){
        helper = new SubStringHelper();
    }

    public SubStringHelperParameterizedTest (String input, String expectedOutput) {
        super();
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<String[]> testConditions() {
        String expectedOutputs[][] = {
                {"AACD", "CD"},
                {"ACD", "CD"},
                {"AECD", "ECD"},
                {"AAACD", "ACD"},
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal + " input- " + input + ". Output - " + expectedOutput);

        Assert.assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }


}