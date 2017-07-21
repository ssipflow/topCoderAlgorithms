package com.topcoder.thePalindrome;

public class Main {

    public static void main(String[] args){
        ThePalindrome thePalindrome = new ThePalindrome();

        String s = "abdfhdyrbdbsdfghjkllkjhgfds";
        int returns = thePalindrome.find(s);
        System.out.println("Returns: " + returns);
    }
}
