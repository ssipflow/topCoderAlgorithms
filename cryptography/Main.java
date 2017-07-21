package com.topcoder.cryptography;

public class Main {

    public static void main(String[] args){
        Cryptography cryptography = new Cryptography();

        int[] numbers =  {1000, 999, 998, 997, 996, 995};
        System.out.println("Returns: " + cryptography.encrpt(numbers));
    }
}
