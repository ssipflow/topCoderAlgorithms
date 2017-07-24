package com.topcoder.friendScore;

public class Main {

    public static void main(String[] args){
        FriendScore friendScore = new FriendScore();

        String[] friends = { "NNNNYNNNNN" , "NNNNYNYYNN" , "NNNYYYNNNN" , "NNYNNNNNNN" , "YYYNNNNNNY" , "NNYNNNNNYN" , "NYNNNNNYNN" , "NYNNNNYNNN" , "NNNNNYNNNN" , "NNNNYNNNNN" };
        int returns = friendScore.highestScore(friends);

        System.out.println("Returns: " + returns);
    }
}
