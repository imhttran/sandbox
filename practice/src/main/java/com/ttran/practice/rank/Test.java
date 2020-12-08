package com.ttran.practice.rank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

    public static int nonDuplicates(int[] array) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int a : array) {
            Integer aNum = count.get(a);
            if(aNum == null) {
                aNum = 1;
            } else {
                aNum++;
            }
            count.put(a, aNum);
        }
        Set<Integer> keySet = new HashSet<>(count.keySet());
        for(Integer key : keySet) {
            // INSERT MISSING CODE
            count.remove(key);
        }

   return count.size();
}

}
