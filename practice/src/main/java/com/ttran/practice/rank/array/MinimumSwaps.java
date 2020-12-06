package com.ttran.practice.rank.array;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int swaps = 0;

        // We need to match the value with the index
        // Since we have 1..n no, all values are there

        for (int i = 0; i < arr.length; i++) {
            // Since index is zero base and value is 1 based.
            // check for equivalent
            if (arr[i] == i + 1) {
                continue;
            }

            // So new we need to keep swapping
            int temp = arr[i];
            arr[i] = arr[arr[i]-1];
            arr[temp-1] = temp;
            swaps++;

//            printArr(arr);
            i = -1;

        }

//        System.out.println(swaps);

        return swaps;
    }


    private static void printArr(int arr[] ){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }


    public static void main(String[] args) {
//        int[] arr = {2,3,6,5,1,4};
        int[] arr = {2,3,1,4};
        // {2, 3, 1,4}
        // [0]  get  3
        // [2]  get 2  {3,2,1,4}

        // [0] get index = 3-1 = 2 which is value 1


        System.out.println("swap = "+ minimumSwaps(arr));
    }




}
