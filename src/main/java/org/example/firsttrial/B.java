package org.example.firsttrial;

public class B implements A{



    public int test() {
        int i = 1;
        try {
            return i;
        } finally {
            i = 2;
        }
    }
    public static void main(String[] args) {
        B b = new B();
        int j = b.test();
        System.out.println(j);
    }
}
