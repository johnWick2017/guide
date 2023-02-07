package com.yatchigz.datastructures.tree;

import javax.swing.tree.TreeNode;

/**
 * Create on 2023-02-06
 * Copyright (c) 2023 by XueBang Information Technology Co.Ltd.
 * All Rights Reserved, Designed By XueBangSoft
 * Copyright:  Copyright(C) 2014-2023
 * Company:    XueBang Information Technology Co.Ltd.
 *
 * @author y
 */
public class TreeTest {

    public static void main(String[] args) {
        MyTreeNode root = new MyTreeNode("A");
        MyTreeNode left1 = new MyTreeNode("B");
        MyTreeNode right1 = new MyTreeNode("C");
        root.setLeft(left1);
        root.setRight(right1);

        MyTreeNode left2 = new MyTreeNode("D");
        MyTreeNode right2 = new MyTreeNode("E");
        left1.setLeft(left2);
        left1.setRight(right2);

        MyTreeNode left3 = new MyTreeNode("F");
        MyTreeNode right3 = new MyTreeNode("G");
        right1.setLeft(left3);
        right1.setRight(right3);

        preOrder(root);
        inOrder(root);
        postOrder(root);

    }

    //先序遍历
    /**
     * 先输出根结点，再遍历左子树，最后遍历右子树，遍历左子树和右子树的时候，同样遵循先序遍历的规则，也就是说，我们可以递归实现先序遍历。
     * @param treeNode
     */
    public static void preOrder(MyTreeNode treeNode){
        if (treeNode == null){
            return;
        }
        System.out.println(treeNode.getData());
        preOrder(treeNode.getLeft());
        preOrder(treeNode.getRight());
    }

    //中序遍历
    /**
     * 先递归中序遍历左子树，再输出根结点的值，再递归中序遍历右子树
     * @param treeNode
     */
    public static void inOrder(MyTreeNode treeNode){
        if (treeNode == null){
            return;
        }
        inOrder(treeNode.getLeft());
        System.out.println(treeNode.getData());
        inOrder(treeNode.getRight());
    }

    //后序遍历
    /**
     * 先递归后序遍历左子树，再递归后序遍历右子树，最后输出根结点的值
     * @param treeNode
     */
    public static void postOrder(MyTreeNode treeNode){
        if (treeNode == null){
            return;
        }
        postOrder(treeNode.getLeft());
        postOrder(treeNode.getRight());
        System.out.println(treeNode.getData());
    }

}
