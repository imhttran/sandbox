package com.ttran.practice.rank.array;

import java.util.Scanner;

public class MinimumBribes {


    // Complete the MinimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribe=0;
        int n = q.length;
        for(int i = 0; i < n; i++)
        {
            if(q[i]-(i+1) > 2)
            {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i]-2); j < i; j++)
                if (q[j] > q[i])
                    bribe++;
        }
        System.out.println(bribe);
    }



    public static void main(String[] args) {
        int[] q = {1, 2, 5, 3, 4, 7, 8, 6};

        minimumBribes(q);
    }
}
