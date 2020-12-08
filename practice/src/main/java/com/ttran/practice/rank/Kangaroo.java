package com.ttran.practice.rank;

public class Kangaroo {


    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        int dist = x1 - x2;
        int dv = v1 - v2;
        if ((dv * dist < 0) && (dist % dv == 0))
            return "YES";
        return "NO";

    }


    public static void main(String[] args) {
        /**
         * x1 , v1 = starting / velocity1
         * x2 , v2 = starting / velocity2
         * where x1 <= x2 and v1 >= v2
         * 0 2 5 3
         */


        System.out.println(kangaroo(0,2,5,3));

        System.out.println(kangaroo(0 ,3, 4, 2));

    }
}
