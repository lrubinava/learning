package com.Practice;

import java.util.List;

public class CellCompete {

    public static int[] cellCompete(int[] states, int days) {
        int result[] = states.clone();

        int prev, next;
        while (days-- > 0) {
            for (int i = 0; i < states.length; i++) {
                if ((i - 1) < 0) {
                    prev = 0;
                }
                else {
                    prev = states[i-1];
                }
                if ((i + 1) >= states.length) {
                    next = 0;
                }
                else {
                    next = states[i+1];
                }
                //
                /*if (prev == next) {
                    result[i] = 0;
                }
                else {
                    result[i] = 1;
                }*/
                result[i] = prev ^ next;
            }
            states = result.clone();
        }

        return states;
    }

}
