package com.ttran.practice.rank;

import java.util.Arrays;
import java.util.List;

public class BonAppetit {

    // Complete the bonAppetit function below.
    // k = index not eaten , b = bill
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int actual=0;
        int total=0;

        for(int i=0;i<bill.size();i++){
            if (i != k) total += bill.get(i);
        }
        actual=total/2;
        if(actual==b)
            System.out.print("Bon Appetit");
        else
            System.out.print(b-actual);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5);
        bonAppetit(list,1, 7);

    }


}
