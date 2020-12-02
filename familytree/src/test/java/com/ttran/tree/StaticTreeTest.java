package com.ttran.tree;

import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

public class StaticTreeTest {

    private static String csv ="null,0,grandpa|0,1,son|0,2,daugther|1,3,grandkid|1,4,grandkid|2,5,grandkid|5,6,greatgrandkid";


    // This is more of a static upload where you need to put the right match parent with the right person
    @Test
    public void testTree(){

        HashMap<Integer, Person> everyone = StringToObjectMapUtil.getEveryone(csv);

        StaticTree<Person> grandpa = new StaticTree<>(everyone.get(Integer.valueOf(0)));
        StaticTree<Person> son = new StaticTree<>(everyone.get(Integer.valueOf(1)), grandpa);
        StaticTree<Person> daughter = new StaticTree<>(everyone.get(Integer.valueOf(2)), grandpa);
        StaticTree<Person> gk3 = new StaticTree<>(everyone.get(Integer.valueOf(3)), son);
        StaticTree<Person> gk4 = new StaticTree<>(everyone.get(Integer.valueOf(4)), son);
        StaticTree<Person> gk5 = new StaticTree<>(everyone.get(Integer.valueOf(5)), daughter);
        StaticTree<Person> ggk = new StaticTree<>(everyone.get(Integer.valueOf(6)), gk5);


        assertThat(grandpa.getSelf().getId().intValue() , is(0));
        assertThat(grandpa.getSelf(), is(everyone.get(0)) );

        assertThat(grandpa.getChildren(), containsInAnyOrder(
                son,
                daughter)
        );




        for (StaticTree<Person> node : grandpa.getChildren()){

            // make sure the son has 2 kids
            if (node.getSelf().equals(everyone.get(1))){
                assertThat(node.getChildren().size(), is(2));
                assertThat(node.getChildren(), containsInAnyOrder(
                        gk3,
                        gk4)
                );
            }

            // make sure the daughter has 1 kid and one grand kid
            if (node.getSelf().equals(everyone.get(2))){

                assertThat(node.getChildren().size(), is(1));
                assertThat(node.getChildren(), containsInAnyOrder(
                        gk5)
                );

                for (StaticTree<Person> n: node.getChildren()){
                    assertThat(n.getChildren().size(), is(1));
                    assertThat(n.getChildren(), containsInAnyOrder(
                            ggk
                    ));
                }
            }
        }
    }
}
