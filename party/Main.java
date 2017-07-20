package com.topcoder.party;

public class Main {

    public static void main(String[] args){
        InterestingParty interestingParty = new InterestingParty();

        String[] first = {"t", "o", "p", "c", "o", "d", "e", "r", "s", "i", "n", "g", "l", "e", "r", "o", "u", "n", "d", "m", "a", "t", "c", "h", "f", "o", "u", "r", "n", "i"};
        String[] second =  {"n", "e", "f", "o", "u", "r", "j", "a", "n", "u", "a", "r", "y", "t", "w", "e", "n", "t", "y", "t", "w", "o", "s", "a", "t", "u", "r", "d", "a", "y"};

        int returns = interestingParty.bestInvitation(first, second);
        System.out.println("Returns: " + returns);
    }
}
