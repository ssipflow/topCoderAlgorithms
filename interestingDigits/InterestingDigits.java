package com.topcoder.interestingDigits;

import java.util.ArrayList;
import java.util.Arrays;

public class InterestingDigits {

    public int[] digits(int base){
        if(base < 3 || base > 30) return null;

        ArrayList<Integer> resultList = new ArrayList<>();
        int digit = base - 1;
        for(int i = 2; i < base; i++){
            if(digit % i == 0){
                resultList.add(i);
            }
        }

        int[] resultArr = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++){
            resultArr[i] = resultList.get(i);
        }

        System.out.print("Returns: ");
        for(int i = 0; i < resultArr.length; i++){
            System.out.print(resultArr[i] + " ");
        }
        System.out.println();

        return resultArr;
    }
}
