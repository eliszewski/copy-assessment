package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) { //k is flagheight j is jumpheight
        if(j>k){
            return k;
        }
        int counter = 0;
        int pos = 0;
        while(pos < k){
            if(pos == k){
                return counter;
            }
            if(!(pos + j > k)){
                pos+= j;
                counter++;
            }
            if(pos + j > k){
                return counter + (k - pos);
            }
        }

        return -1;
    }
}
