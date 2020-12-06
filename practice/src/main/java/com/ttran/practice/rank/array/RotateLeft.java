package com.ttran.practice.rank.array;

public class RotateLeft {

    static int[] rotLeft(int[] a, int d) {
        int len = a.length;

        int[] temp = new int[len];
        for (int i = 0; i <len ; i++) {
            if (i + d < len) {
                temp[i] = a[i + d];
            } else {
                temp[i] = a[(i + d) - len];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int [] values = {1 ,2, 3, 4 ,5};
        int[] rotated= rotLeft(values, 3);
        for (int i = 0; i < rotated.length ; i++) {
            System.out.print(rotated[i]);
        }

    }
}
