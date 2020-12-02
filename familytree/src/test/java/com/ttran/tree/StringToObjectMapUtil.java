package com.ttran.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class StringToObjectMapUtil {



    public static HashMap<Integer,Person> getEveryone(String csv){
        String[] members  = csv.split("\\|");
        HashMap<Integer,Person> list = new HashMap<>();

        for (int i = 0; i < members.length ; i++) {
            String[] values = members[i].split(",");
            Integer parentId = toIntteger(values[0]);
            Integer id = toIntteger(values[1]);
            String title = values[2];
            Person person = Person.newPerson(id, parentId, title);
            list.put(id,person);
        }
        return list;
    }

    // this can be a static helper method
    private static Integer toIntteger(String s){
        try {
            return   Integer.parseInt(s);
        }catch (Exception e){
            return null;
        }
    }

}
