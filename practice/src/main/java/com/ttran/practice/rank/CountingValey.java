package com.ttran.practice.rank;

public class CountingValey {


    static int countValey(int step,String path){
        boolean level = true;
        int up = 0;
        int down = 0;

        for(int i=0; i < step; i++) {
            if (path.charAt(i) == 'D') {
                up--;
            } else {
                up++;
            }
            if (level && up < 0) {
                down++;
            }
            level = up == 0;
        }
        return down;
    }


    public static void main(String[] args) {
        String s = "DDUUUUDD";
        int count =countValey(8, s);
        System.out.println(count);
    }
}
