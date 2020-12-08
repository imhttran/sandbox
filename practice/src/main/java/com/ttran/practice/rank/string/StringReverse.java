package com.ttran.practice.rank.string;

public class StringReverse {

    public static void main(String[] args) {
        String s = "madam";
//        char[] c = s.toCharArray();
//        for (int i = 0; i < c.length ; i++) {
//
//        }


        StringBuffer stringBuffer = new StringBuffer(s);
        String reversed = stringBuffer.reverse().toString();

        if (reversed.equals(s)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
