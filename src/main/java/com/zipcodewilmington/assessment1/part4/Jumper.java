package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int count = 0;
        int current = 0;

        while (current + j <= k) {
            current += j;
            count++;
        }

        while (current < k) {
            current++;
            count++;
        }

        return count;
    }
}
