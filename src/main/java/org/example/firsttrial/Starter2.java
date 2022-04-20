package org.example.firsttrial;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Starter2 {

    public static void main(String[] args) {

        List l = new LinkedList<>();

        l.add("Leeks");
        l.add("for");
        l.add("Geek");
        l.add("Greeks");
        Iterator i = l.listIterator();

        int count=0;

        while (i.hasNext()){
            String value = (String) i.next();
            if(value.contains("G"))
                ++count;
        }
        System.out.println(count);
    }

}
// Here output of the Program can be two of them : 1. is error due to iterator.next.contains and if we rectify that then 2.
// 2
// Inheritance, Abstraction, Inheritance
// Reason1 - Linkedlist implements List interface
// Reason2 - list.iterator() shows that calling a method that gives you a functionality out of the box and we are not privy to the same
// Reason3 - also a set can call the iterator method, as Collection interface contains a method iterator() hence any subclass of Collection can use this method
// #Remove this line# Reference - https://stackify.com/oops-concepts-in-java/