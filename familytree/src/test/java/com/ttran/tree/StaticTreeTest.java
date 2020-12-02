package com.ttran.tree;

import org.junit.Test;

import java.util.HashMap;

public class StaticTreeTest {

    private static String csv ="null,0,grandpa|0,1,son|0,2,daugther|1,3,grandkid|1,4,grandkid|2,5,grandkid|5,6,greatgrandkid";
    
    @Test
    public void testTree(){


        HashMap<Integer, Person> everyone = StringToObjectMapUtil.getAll(csv);

        StaticTree<Person> grandpaNode = new StaticTree<>(everyone.get(Integer.valueOf(1)));

        StaticTree<Person> sonNode = new StaticTree<>(everyone.get(Integer.valueOf(1)), grandpaNode);
        StaticTree<Person> daughterNode = new StaticTree<>(everyone.get(Integer.valueOf(2)), grandpaNode);

        StaticTree<Person> gk3 = new StaticTree<>(everyone.get(Integer.valueOf(3)), sonNode);
        StaticTree<Person> gk4 = new StaticTree<>(everyone.get(Integer.valueOf(4)), sonNode);


        StaticTree<Person> gk5 = new StaticTree<>(everyone.get(Integer.valueOf(5)), daughterNode);
        StaticTree<Person> ggk = new StaticTree<>(everyone.get(Integer.valueOf(6)), gk5);


        System.out.println(grandpaNode);
    }
}
