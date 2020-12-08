package com.ttran.practice.rank.string;

public class StringFormat {

//    https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
    public static void main(String[] args) {
        String[] sc = {"java 100", "cpp 65", "python 050"};
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc[i];
            String[] ss = s1.split(" ");
            String s = ss[0];
            String s2 = ss[1];
            int num = Integer.parseInt(s2);

            //Complete this line

            System.out.printf("%-15s%03d%n", s, num);
        }
        System.out.println("================================");

    }
}
