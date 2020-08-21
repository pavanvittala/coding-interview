package com.pvittala.leetcode.maxdepthofbinarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthOfBinaryTreeTest {

    @Test
    void maxDepthOfBinaryTreeWithNullInput() {
        int actual = MaxDepthOfBinaryTree.maxDepth(null);
        assertEquals(0, actual);
    }

    @Test
    void maxDepthOfBinaryTreeWithRoot() {
        TreeNode root = new TreeNode(20);
        int actual = MaxDepthOfBinaryTree.maxDepth(root);
        assertEquals(1, actual);
    }

    @Test
    void maxDepthOfBinaryTree1() {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);

        int actual = MaxDepthOfBinaryTree.maxDepth(root);
        assertEquals(2, actual);
    }

    @Test
    void maxDepthOfBinaryTree2() {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.left.left = new TreeNode(5);

        int actual = MaxDepthOfBinaryTree.maxDepth(root);
        assertEquals(3, actual);
    }

    /*
            3
           / \
          9  20
            /  \
           15   7
     */
    @Test
    void maxDepthOfBinaryTreeComplex() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int actual = MaxDepthOfBinaryTree.maxDepth(root);
        assertEquals(3, actual);
    }
}
