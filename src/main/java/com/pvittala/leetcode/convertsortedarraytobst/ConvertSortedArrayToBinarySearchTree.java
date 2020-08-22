package com.pvittala.leetcode.convertsortedarraytobst;

/**
 * LeetCode Convert Sorted Array To Binary Search Tree problem.
 * @author Pavan Vittala
 */
public class ConvertSortedArrayToBinarySearchTree {
    /**
     * Given an array where elements are sorted in ascending order,
     * convert it to a height balanced BST.
     * <br/>
     * For this problem, a height-balanced binary tree is defined
     * as a binary tree in which the depth of the two subtrees of
     * every node never differ by more than 1.
     * @param nums the sorted array
     * @return BST rooted at a {@link TreeNode}
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        return createSubtree(nums, 0, nums.length-1);
    }

    /**
     * Recursively creates subtrees.
     * <br/>
     * Recursively splits the array into halves, and constructs the subtree roots
     * using the sub-arrays' midpoints.
     * <br/>
     * The trick is to understand that a balanced BST has a pattern to it - the
     * roots of the subtrees are the midpoints in the sub-arrays.
     * @param nums the array of sorted numbers
     * @param from the start index to evaluate from
     * @param to the end index
     * @return the root of the subtree
     */
    private static TreeNode createSubtree(int[] nums, int from, int to) {
        // Base case
        if (from > to) {
            return null;
        }

        int mid = (from+to)/2;
        final TreeNode subTreeRoot = new TreeNode(nums[mid]);

        subTreeRoot.left = createSubtree(nums, from, mid-1);
        subTreeRoot.right = createSubtree(nums, mid+1, to);

        return subTreeRoot;
    }
}
