package com.ttran.practice.rank;

public class BreakingRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int lowRecord = scores[0];
        int highRecord = scores[0];

        int[] result = new int[2];  // this hold the count when thing change
        for (int i = 1; i < scores.length ; i++){
            if (scores[i] > highRecord){
                ++result[0];
                highRecord = scores[i];
            }else if (scores[i] < lowRecord){
                ++result [1];
                lowRecord = scores[i];
            }
        }
        return result;

    }


    public static void main(String[] args) {
        int [] scores = {3 ,4 ,21 ,36 ,10, 28, 35, 5, 24, 42};

        int[] records= breakingRecords(scores);

    }
}
