package com.pvittala.leetcode.singlenumber;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Single Number problem.
 * @author Pavan Vittala
 */
public class SingleNumber {
    /**
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     * @param numbers array with numbers to evaluate
     * @return the single-occurring number from the aforementioned array
     */
    public static int singleNumber(final int[] numbers) {
        // Solution works by computing the difference
        // between the potential sum (if all unique
        // entrants occurred twice) and the total sum
        // in the array. The difference will be the
        // value that's present only once.
        int potentialSum = 0;
        int actualSum = 0;
        final Set<Integer> seenBefore = new HashSet<>();
        for (int num : numbers) {
            if (!seenBefore.contains(num)) {
                potentialSum += num*2;
                seenBefore.add(num);
            }
            actualSum += num;
        }
        return potentialSum - actualSum;
    }
}
