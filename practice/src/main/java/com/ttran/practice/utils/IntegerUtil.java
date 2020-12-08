package com.ttran.practice.utils;

public class IntegerUtil {

    // Unit tested
    public static int strToInt(String s){
        int i = 0 , num =0;
        boolean isNeg = false;
        int len = s.length();
        if (s.charAt(0) == '-'){
            isNeg = true;
            i = 1;
        }


        while ((i < len)){
            num *=10;
            num += (s.charAt(i++) - '0');
        }

        if (isNeg){
            num = -num;
        }
        return num;
    }


    public static final int MAX_DIGITS=10;
    public static String intToString (int num){

        boolean isNeg=false;

        int i =0;

        char[] buffer = new char[MAX_DIGITS +1];

        if (num<0){
            // Special case to avoid overflow on negation
            if (num == Integer.MIN_VALUE){
                return "-2147483648";
            }
            isNeg=true;
            num = -num;
        }
        do {
            buffer[i++] = (char)((num %10) + '0');
            num /= 10;
        }while (num !=0);


        StringBuffer sb = new StringBuffer();
        if (isNeg){
            sb.append('-');
        }

        while ((i > 0)) {
            sb.append(buffer[--i]);
        }

        return sb.toString();
    }

}
