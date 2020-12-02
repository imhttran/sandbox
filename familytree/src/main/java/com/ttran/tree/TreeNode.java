package com.ttran.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class TreeNode {

    private Person self;
    private List<TreeNode> children = new ArrayList<>();

    private TreeNode(Person person) {
        this.self = person;
    }

    public static TreeNode newTreeNode(Person person){
        return new TreeNode(person);
    }

    public TreeNode newTreeNode(Person person, List<TreeNode> children){
        TreeNode node= new TreeNode(person);
        node.setChildren(children);
        return node;
    }

    public Person getSelf() {
        return self;
    }


    public Collection<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode)) return false;
        TreeNode treeNode = (TreeNode) o;
        return getSelf().equals(treeNode.getSelf()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSelf(), getChildren());
    }
}
