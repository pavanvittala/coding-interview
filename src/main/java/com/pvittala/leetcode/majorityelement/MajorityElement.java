package com.pvittala.leetcode.majorityelement;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Majority Element problem.
 * @author Pavan Vittala
 */
public class MajorityElement {
    /**
     * Given an array of size n, find the majority element. The majority element is the
     * element that appears more than ⌊ n/2 ⌋ times.
     * <br/>
     * You may assume that the array is non-empty and the majority element always exist
     * in the array.
     * @param nums array of numbers to process
     * @return the majority element
     */
    public static int majorityElement(final int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        final int majority = nums.length/2;
        final Map<Integer, Integer> occurences = new HashMap<>();
        for (int num : nums) {
            Integer priorValue = occurences.putIfAbsent(num, 1);
            if (priorValue != null) {
                final int newValue = priorValue+1;
                occurences.replace(num, newValue);
                if (newValue > majority) {
                    return num;
                }
            }
        }
        // Unable to find a majority value
        return -1;
    }
}
