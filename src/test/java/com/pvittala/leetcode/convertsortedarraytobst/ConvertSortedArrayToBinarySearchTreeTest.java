package com.pvittala.leetcode.convertsortedarraytobst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    void sortedArrayToBST() {
        int[] input = {-10,-3,0,5,9};
        TreeNode root = ConvertSortedArrayToBinarySearchTree.sortedArrayToBST(input);
        assertNotNull(root);
        assertEquals(0, root.val);
        assertNotNull(root.left);
        assertEquals(-3, root.left.val);
    }
}
