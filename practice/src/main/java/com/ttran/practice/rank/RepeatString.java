package com.ttran.practice.rank;

public class RepeatString {

    static long repeatedString(String s, long n) {
        char[] arr = s.toCharArray();
        char a = 'a';
        long count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                count++;
            }
        }

        System.out.println("count per = " + count);

        count = (n / arr.length) * count;  // multiply per

        long rem = n % arr.length;  // get left over
        for (int j = 0; j < rem; j++) {
            if (arr[j] == a) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "aba";
        long count = repeatedString(s, 10);
//        "abaabaabaa"
        System.out.println("count = "+count);
    }

}
