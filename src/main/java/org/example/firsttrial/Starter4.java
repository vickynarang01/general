package org.example.firsttrial;

public class Starter4 {


    public String reverseString(String value){
        if(value!=null){
            StringBuilder reverseString = new StringBuilder(value);
            return String.valueOf(reverseString.reverse());
        }
        else{
            throw new NullPointerException();
        }
    }


    public String wordToString(String value, int number){
        String[] strArray = null;
        strArray = value.split(" ");
        for (int i=0;i<=strArray.length;i++)
        {
            try{if (number!=0 && i==number-1){
                System.out.println(strArray[i]);
            }}
            catch(ArrayIndexOutOfBoundsException e){
                throw new ArrayIndexOutOfBoundsException();
            }
        }
        return "";
    }
    public static void main(String[] args) {

            Starter4 s4 = new Starter4();
            String reverse= s4.reverseString("no value");
            System.out.println("Reversed String::"+reverse);
            s4.wordToString("one two three four",3);


    }

}
