package com.topcoder.kiwi;

import com.topcoder.kiwi.KiwiJuiceEasy;

public class Main {

    public static void main(String[] args){
        KiwiJuiceEasy kiwiJuiceEasy = new KiwiJuiceEasy();

        int[] capacities = {700000, 800000, 900000, 1000000};
        int[] bottles = {478478, 478478, 478478, 478478};
        int[] fromId = {2, 3, 2, 0, 1};
        int[] toId = {0, 1, 1, 3, 2};

        kiwiJuiceEasy.thePouring(capacities, bottles, fromId, toId);
    }
}
