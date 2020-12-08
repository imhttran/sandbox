package com.ttran.practice.rank.integer;

public class IntegerDataType {

    public static void main(String[] args) {
//        -150
//        150000
//        1500000000
//        213333333333333333333333333333333333
//                -100000000000000

        long[] values = {-150l,150000l, 1500000000l,  -100000000000000l};

        for (int i = 0; i < values.length ; i++) {
//            long x = values[i];

//            if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
//                System.out.println("* byte");
//            }
//            if (x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
//                System.out.println("* short");
//            }
//            if (x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
//                System.out.println("* int");
//            }
//            if (x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
//                System.out.println("* long");
//            }

            try {
                long x = values[i];

                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(values[i] + " can't be fitted anywhere.");
            }

        }
    }
}
