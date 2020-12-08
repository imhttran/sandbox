package com.ttran.practice.rank;

public class CountApplesAndOranges {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int orangeCount=0;
        int apppleCount=0;
        for (int i = 0; i < apples.length; i++) {
            if (a + apples[i] >= s && a + apples[i] <= t) {
                ++apppleCount;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            if (b + oranges[i] >= s && b + oranges[i] <= t) {
                ++orangeCount;
            }
        }

        System.out.println(apppleCount);
        System.out.println(orangeCount);

    }


    public static void main(String[] args) {
//        s: integer, starting point of Sam's house location.
//        t: integer, ending location of Sam's house location.
//        a: integer, location of the Apple tree.
//        b: integer, location of the Orange tree.
//        apples: integer array, distances at which each apple falls from the tree.
//        oranges: integer array, distances at which each orange falls from the tree.

        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;

        int[] apples = {-2, 2, 1};
        int[] oranges = {5 -6};

        countApplesAndOranges(s, t, a, b, apples, oranges);

    }
}
