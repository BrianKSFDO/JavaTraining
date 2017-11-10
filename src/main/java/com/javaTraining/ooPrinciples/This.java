package com.javaTraining.ooPrinciples;

/**
 * Created by Brian on 10/31/2017.
 */

class Frog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // this.name is the instance variable (private String name), name is the String name
        //"this" refers to the object you are currently in, so in the case below it refers to the frog1 or frog2 Object
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge2) {
        this.age = newAge2;  // or you can use
        // age = newAge2
    }
}
public class This {
    public static void main(String[] args) {

        Frog frog1 = new Frog();

        //frog1.name = "Bertie";
        //frog1.age = 2;
        //System.out.println(frog1.name);

        Frog frog2 = new Frog();
        frog2.setName("Burt");
        frog2.setAge(4);

        System.out.println(frog2.getName());
        System.out.println(frog2.getAge());

        frog2.setName("Burt2");
        frog2.setAge(42);
        System.out.println(frog2.getName());
        System.out.println(frog2.getAge());
    }
}
