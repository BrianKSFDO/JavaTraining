package com.example.idea;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Brian on 10/3/2017.
 */
public class PersonTest {

    Person person1;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class");
    }

    @Before
    public void setUp() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        person1 = new Person("Tim", "Smith", 30);
    }

    @Test
    public void getfName() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        Assert.assertEquals("Tim", person1.getfName());
        String actual = person1.getfName();
        String expected = "Tim";
        Assert.assertEquals(actual, expected);
        //  OR
        Assert.assertEquals("Tim", person1.getfName());

    }

    @Test
    public void setfName() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        person1.setfName("NewTim");
        Assert.assertEquals("NewTim", person1.getfName());
    }

    @Test
    public void getlName() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        Assert.assertEquals("Smith", person1.getlName());
    }

    @Test
    public void setlName() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        person1.setlName("NewSmith");
        Assert.assertEquals("NewSmith", person1.getlName());
    }

    @Test
    public void getAge() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        Assert.assertEquals(30, person1.getAge());
    }

    @Test
    public void setAge() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        person1.setAge(21);
        Assert.assertEquals(21, person1.getAge());
    }

    @Test
    public void ConstructorNoArguements() throws Exception {
        final String testNameLocal = new Exception().getStackTrace()[0].getMethodName();
        System.out.println(testNameLocal);
        Person person2 = new Person();
        person2.setfName("First");
        person2.setlName("Name");
        person2.setAge(25);
        Assert.assertEquals("First", person2.getfName());
        Assert.assertEquals("Name", person2.getlName());
        Assert.assertEquals(25, person2.getAge());
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