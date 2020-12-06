package com.ttran.practice.rank;

public class SafeCloud {


    static int jumpingOnClouds(int[] c) {
        int i = 0;
        int jump = 0;
        int len = c.length;


        while (i < c.length-1) {
            // make sure we are safe to jump 2 cloud
            // 1. check to make sure we can jump 2 and not pass the end
            // 2. If we can jump 2 clouds then do it in one jump
            if (i + 2 < len && c[i + 2] == 0) {
                i = i+ 2;
                jump++;
            } else {
                i++;
                jump++;  // we are alway jumping one cloud
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

