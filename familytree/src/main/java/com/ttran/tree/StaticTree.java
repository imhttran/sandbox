package com.ttran.tree;

import java.util.ArrayList;
import java.util.List;

public class StaticTree<T> {

    private final List<StaticTree<T>> children;
    private StaticTree<T> parent;
    private Person self;
    private int depth;

    public StaticTree(Person person) {
        // a fresh node, without a parent reference
        this.children = new ArrayList<>();
        this.parent = null;
        this.self = person;
        this.depth = 0; // 0 is the base level (only the root should be on there)
    }

    public StaticTree(Person person, StaticTree<T> parent) {

        this.children = new ArrayList<>();
        this.self = person;
        this.parent = parent;
        this.depth = (parent.getDepth() + 1);
        parent.addChild(this);
    }

    public int getDepth() {
        return this.depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public List<StaticTree<T>> getChildren() {
        return children;
    }

    public void setParent(StaticTree<T> parent) {
        this.setDepth(parent.getDepth() + 1);
        parent.addChild(this);
        this.parent = parent;
    }

    public StaticTree<T> getParent() {
        return this.parent;
    }

    public void addChild(Person data) {
        StaticTree<T> child = new StaticTree<>(data);
        this.children.add(child);
    }

    public void addChild(StaticTree<T> child) {
        this.children.add(child);
    }

    public Person getSelf() {
        return this.self;
    }

    public void setSelf(Person self) {
        this.self = self;
    }

    public boolean isRootNode() {
        return (this.parent == null);
    }

    public boolean isLeafNode() {
        return (this.children.size() == 0);
    }

    public void removeParent() {
        this.parent = null;
    }


    @Override
    public String toString() {
        return "StaticTree{" +
                "self=" + self +
                ", depth=" + depth +
                '}';
    }
}
