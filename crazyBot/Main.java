package com.topcoder.crazyBot;

public class Main {

    public static void main(String[] args){
        CrazyBot crazyBot = new CrazyBot();

        System.out.println("Returns: " + crazyBot.getProbability(1, 25, 25, 25, 25));
        System.out.println("Returns: " + crazyBot.getProbability(2, 25, 25, 25, 25));
        System.out.println("Returns: " + crazyBot.getProbability(7, 50, 0, 0, 50));
        System.out.println("Returns: " + crazyBot.getProbability(14, 50, 50, 0, 0));
        System.out.println("Returns: " + crazyBot.getProbability(14, 25, 25, 25, 25));
    }

}
