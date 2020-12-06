package com.ttran.practice.rank;

import java.util.Arrays;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int sockPairs = 0;
        int i = 0;
        Arrays.sort(ar);

        // n is number of socks we want to check
        while(i < n){
            if(i + 1 >= n){break;}
            int sockA = ar[i];
            int sockB = ar[i + 1];//check for bounds

            if(sockA == sockB){
                sockPairs++;
                i += 2;  // skip 2
            }
            else{
                i += 1; // odd out, skip this
            }
        }
        return sockPairs;
    }


    // Count how many pairs of sock.
    // 1. Can we sort first, YES

    public static void main(String[] args) {
        int[] sockes = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int count = sockMerchant(9, sockes);
        System.out.println(count);
    }
}
