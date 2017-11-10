package com.javaTraining.ooPrinciples;

/**
 * Created by Brian on 10/31/2017.
 */

class Machine {
    private String name;
    private int code;

    public Machine() {  //Constructors do not have return type
        // Constructors initialize the instance variables
        // Constructors can take parameters
        this("Arnie", 0); // Calls the Constructor that passes in 2 parameters
        System.out.println("1st Constructor Done! " + this.code + " : " + this.name);
    }

    public Machine(String name) {
        this(name, 0);
        System.out.println("2nd Constructor Running");
        this.name = name;
        System.out.println("2nd Contstructor Done! " + this.code + " : " + this.name);
    }

    public Machine(String Name, int code) {
        System.out.println("3rd Constructor Running");
        this.name = Name;
        this.code = code;
        System.out.println("3rd Contstructor Done! " + this.code + " : " + this.name);
    }
}

public class Constructors {

    public static void main(String[] args) {

        Machine machine1 = new Machine();
        System.out.println("--------------------------------------");
        Machine machine2 = new Machine("Brian");
        System.out.println("--------------------------------------");
        Machine machine3 = new Machine("Tom", 3);
        System.out.println("--------------------------------------");
        new Machine();
    }
}
