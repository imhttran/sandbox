package com.ttran.practice.rank;

public class SafeCloud {


    static int jumpingOnClouds(int[] c) {
        int i = 0;
        int jump = 0;
        int len = c.length;

        while (i < c.length-1) {
            if (i + 2 < len && c[i + 2] == 0) {
                i = i+ 2;
                jump++;
            } else {
                i++;
                jump++;
            }
        }
        return jump;

    }


    public static void main(String[] args) {
        int[] c = {0, 0, 0, 0, 1, 0};
        int[] c2 = {0 ,0, 1, 0, 0, 1, 0};

        int count = jumpingOnClouds(c);
        System.out.println(count);

        int count2 = jumpingOnClouds(c2);
        System.out.println(count2);
    }
}

