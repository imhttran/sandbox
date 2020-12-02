package com.ttran.tree;


import java.util.List;
import java.util.Optional;

public class FamilyTree {


    /**
     * This method will take an ordered base on ID and create a family tree
     *                      grandpa
     *                son           daughter
     *         grandkid grandkid       grandkid
     *                                      greatgrandkid
     * @param nodes
     * @return
     */
    public TreeNode newTree(List<TreeNode> nodes ){

        TreeNode root = getRoot(nodes);
        TreeNode parent = root;
        for (TreeNode node: nodes){
            parent = getParent(root, node);
            if (parent!=null
                    && parent.getSelf().getId().equals(node.getSelf().getParentId())){
                addMember(parent, node);
            }
        }
        return root;
    }


    private void addMember(TreeNode parent, TreeNode child){
        if (parent==null) throw new IllegalArgumentException("Parent node is NULL");
        if (parent ==null) throw new IllegalArgumentException("Child node is NULL");

        if (parent.getSelf().getId() == null || !parent.getSelf().getId().equals(child.getSelf().getParentId())){
            throw new IllegalArgumentException("This person is not a child ");
        }
        parent.getChildren().add(child);
    }

    /**
     * Using recursive for find a node by ID
     * @param root
     * @param id
     * @return
     */
    private TreeNode getNode(TreeNode root, Integer id){
        if (root.getSelf().getId().equals(id)){
            return root;
        }else if (!root.getChildren().isEmpty()) {
            for(TreeNode node: root.getChildren()){
                if (node.getSelf().getId().equals(id)){
                    return node;
                }else {
                    return getNode(node, id);
                }
            }
        }
        // We return Optional here
        return null;
    }


    /**
     * This is just a trial to see if I can reduce the time factor
     * @param root
     * @param child
     * @return
     */
    private TreeNode getParent(TreeNode root, TreeNode child){
        if (child.getSelf().getParentId()==null){
            // this is the root node
            return child;
        }else{
            // the root and the parent is the same
            if (root.getSelf().getId().equals(child.getSelf().getParentId())) return root;

            TreeNode parent = null;
            for(TreeNode node: root.getChildren()){
                if (node.getSelf().getId().equals(child.getSelf().getParentId())){
                    return node;
                }else{
                    parent = getNode(node, child.getSelf().getParentId());
                }
            }
            return parent;
        }
    }

    /**
     * We know grandpa has no parent
     * @param nodes
     * @return
     */
    private TreeNode getRoot(List<TreeNode> nodes){
        // I am using Stream here, but you can use a for loop
        Optional<TreeNode> optional= nodes.stream().filter(treeNode -> treeNode.getSelf().getParentId() ==null).findAny();
        return optional.get();
    }
}
