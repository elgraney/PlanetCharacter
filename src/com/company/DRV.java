package com.company;

import java.util.Random;

/**
 * Created by Matthew on 12.2.18.
 */
public class DRV {

    public static String discreteRV(String[] values, int[] chance, int seed) {


        int rand = new Random(seed).nextInt(100);

        int left = 0, right = 0;
        for (int i = 0; i < chance.length; i++) {
            right += chance[i];
            if (rand >= left && rand < right)
                return values[i];
            left = right;
        }

        return "Fail";
    }
}
