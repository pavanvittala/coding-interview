package com.pvittala.leetcode.reversestring;

/**
 * LeetCode ReverseString problem.
 * @author Pavan Vittala
 */
public class ReverseString {
    /**
     * Write a function that reverses a string. The input string is given as an array of characters char[].
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * You may assume all the characters consist of printable ascii characters.
     * @param word String to be reversed in-place.
     */
    public static void reverseString(final char[] word) {
        int leftIndex = 0;
        int rightIndex = word.length-1;

        // The first condition (rightIndex > 0) ensures empty arrays and arrays of length 1 are not processed
        // The second condition (rightIndex > leftIndex) ensures that both even and odd length arrays can be processed
        while (rightIndex > 0 && rightIndex > leftIndex) {
            char temp = word[rightIndex];
            word[rightIndex] = word[leftIndex];
            word[leftIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }
}
