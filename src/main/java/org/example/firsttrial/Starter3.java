package org.example.firsttrial;

public class Starter3 {

    int num = 100;
    public void calc(int num){ num = num*10;}
    public void printNum(){
        System.out.println(num);
    }

    public static void main(String[] args) {
        Starter3 s = new Starter3();
        s.calc(2);
        s.printNum();
    }
}

// Here output of the program will be 20
// Abstraction
// Reason1 - Abstraction simply is when you create things like Class,Objects, define variables. As it is binding some information Like the calc and printNum functions that is unknown to end user.
