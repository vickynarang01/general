package org.example.firsttrial;

public class Starter {

    private int data;

    public int getData() {
        return data;
    }

    public int getData(int value) {
        return data+1;
    }

    public String getData(String value) {
        return value+2;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Starter s = new Starter();
        System.out.println(s.getData(7));
        System.out.println(s.getData("string value"));

    }
}
// Here the output of the above program would be
// 6
// 7
// Abstraction, Encapsulation, Polymorphism particularly overloading is being used over here
// Reason1 - Abstraction simply is when you create things like Class,Objects, define variables. As it is binding some information that is unknown to end user.
// Reason2 - Here we have defined a private member data in the class, that means we are hiding some data that can only be accessed by class methods
// Reason3 - as we see the getData method has different arguments yet same return type, which is an example of method overloading in java
// #Remove this line# Reference - https://stackify.com/oops-concepts-in-java/