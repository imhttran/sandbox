package com.ttran.practice.rank;

import java.util.Arrays;
import java.util.List;

public class GetTotalX {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here

        Integer[] aa = new Integer[a.size()];
        Integer[] bb = new Integer[b.size()];


        int f = lcm( a.toArray(aa));
        int l = gcd( b.toArray(bb));
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;}
        }
        return count;
    }


    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(2,3);
        List<Integer> b = Arrays.asList(16 ,32, 96);

        System.out.println(getTotalX(a, b));
    }

    private static Integer gcd(Integer a, Integer b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static Integer gcd(Integer[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }

    private static Integer lcm(Integer a, Integer b) {
        return a * (b / gcd(a, b));
    }

    private static Integer lcm(Integer[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }
}
