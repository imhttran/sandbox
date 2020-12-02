package com.ttran.tree;

import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
//import static org.junit.Assert.assertThat;


public class FamilyTreeTest {

    private static String csv ="null,0,grandpa|0,1,son|0,2,daugther|1,3,grandkid|1,4,grandkid|2,5,grandkid|5,6,greatgrandkid";

    @Test
    public void addNodeTest(){

        TreeNode root = setupTree();

        Person grandpa= Person.newPerson(0, null, "grandpa");
        Person son= Person.newPerson(1, 0, "son");
        Person daugther= Person.newPerson(2, 0, "daugther");

        assertThat(root.getSelf().getId().intValue() , is(0));
        assertThat(root.getSelf(), is(grandpa) );

        assertThat(root.getChildren(), containsInAnyOrder(
                TreeNode.newTreeNode(son),
                TreeNode.newTreeNode(daugther)
        ));

        Person grandkid3= Person.newPerson(3, 1, "grandkid");
        Person grandkid4= Person.newPerson(4, 1, "grandkid");
        Person grandkid5= Person.newPerson(5, 2, "grandkid");
        Person greatgrandkid= Person.newPerson(6, 5, "greatgrandkid");


        for (TreeNode node : root.getChildren()){

            // make sure the son has 2 kids
            if (node.getSelf().equals(son)){
                assertThat(node.getChildren().size(), is(2));
                assertThat(node.getChildren(), containsInAnyOrder(
                        TreeNode.newTreeNode(grandkid3),
                        TreeNode.newTreeNode(grandkid4)
                ));
            }

            // make sure the daughter has 1 kid and one grand kid
            if (node.getSelf().equals(daugther)){

                assertThat(node.getChildren().size(), is(1));
                assertThat(node.getChildren(), containsInAnyOrder(
                        TreeNode.newTreeNode(grandkid5)
                ));

                for (TreeNode n: node.getChildren()){
                    assertThat(n.getChildren().size(), is(1));
                    assertThat(n.getChildren(), containsInAnyOrder(
                            TreeNode.newTreeNode(greatgrandkid)
                    ));
                }
            }
        }

    }


    private TreeNode setupTree(){
        List<TreeNode> nodes = parseEveryone();

        // since the ID is in order you can just sort person by ID
        FamilyTree familyTree = new FamilyTree();

        return familyTree.newTree(nodes);

    }


    private List<TreeNode> parseEveryone(){

        String[] members  = csv.split("\\|");
        List<TreeNode> list = new ArrayList<>();

        for (int i = 0; i < members.length ; i++) {
            String[] values = members[i].split(",");
            Integer parentId = toIntteger(values[0]);
            Integer id = toIntteger(values[1]);
            String title = values[2];
            Person person = Person.newPerson(id, parentId, title);
            list.add(TreeNode.newTreeNode(person));
        }
        return list;
    }

    // this can be a static helper method
    private Integer toIntteger(String s){
        try {
           return   Integer.parseInt(s);
        }catch (Exception e){
            return null;
        }
    }


}
