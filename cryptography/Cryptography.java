package com.topcoder.cryptography;

import java.util.Arrays;

public class Cryptography {

    public long encrpt(int[] numbers){
        if( numbers.length < 2 || numbers.length > 50 ) return -1;

        for(int number : numbers){
            if(number < 1 || number > 1000) return -1;
        }

        long result = 1;
        Arrays.sort(numbers);
        numbers[0]++;

        for(int number: numbers){
            result *= number;
        }

        if(result > Math.pow(2, 62)) return -1;
        else return result;
    }
}
