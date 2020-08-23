package com.pvittala.leetcode.movezeroes;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Move Zeroes problem.
 * @author Pavan Vittala
 */
public class MoveZeros {
    /**
     * Given an array nums, write a function to move all 0's to the end
     * of it while maintaining the relative order of the non-zero elements.
     * <br/><br/>
     * Note:
     * <br/>
     * 1. You must do this in-place without making a copy of the array.
     * <br/>
     * 2. Minimize the total number of operations.
     * @param nums array of numbers to manipulate in-place
     */
    public static void moveZeroes(final int[] nums) {
        int indexOfNonZero = 0;
        // Shift all the non-zero elements to the left-side of the array
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[indexOfNonZero] = nums[i];
                indexOfNonZero++;
            }
        }

        // Fill the right-side of the array with zeroes
        for (int i = indexOfNonZero; i<nums.length; i++) {
            nums[i] = 0;
        }

        // The key to this problem is to realize that the contents of the
        // array are split into zero and non-zero entrants. You need not
        // try to preserve the values of the zeroes, only the non-zeroes.
    }
}
