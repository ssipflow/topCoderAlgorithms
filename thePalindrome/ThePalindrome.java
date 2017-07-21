package com.topcoder.thePalindrome;

public class ThePalindrome {

    public int find(String str){
        if(str.length() < 1 || str.length() > 50) return -1;

        int result = 0;

        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)) return str.length();

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.toString());
        for(int i = 0; i < str.length(); i++){
            sb.insert(str.length(), str.charAt(i));
            if(sb.toString().equals(sb.reverse().toString())){
                result = sb.toString().length();
                break;
            }else{
                sb.reverse();   //if문에서 실행했던 reverse()에 대해 원래 문자열로 reverse() 연산 실행
            }
        }

        return result;
    }
}
