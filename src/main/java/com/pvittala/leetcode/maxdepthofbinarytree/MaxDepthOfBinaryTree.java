package com.pvittala.leetcode.maxdepthofbinarytree;

/**
 * LeetCode Max Depth Of Binary Tree problem.
 * @author Pavan Vittala
 */
public class MaxDepthOfBinaryTree {
    /**
     * Given a binary tree, find its maximum depth.
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     * Note: A leaf is a node with no children.
     * @param root the root of the binary tree
     * @return the depth of the binary tree rooted at the provided initial node
     */
    public static int maxDepth(final TreeNode root) {
        if (root == null)   return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
