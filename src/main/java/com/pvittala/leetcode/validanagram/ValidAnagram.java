package com.pvittala.leetcode.validanagram;

import java.util.*;

/**
 * LeetCode Valid Anagram problem.
 * @author Pavan Vittala
 */
public class ValidAnagram {
    /**
     * Given two strings s and t , write a function to determine if t is an anagram of s.
     * <br/><br/>
     * Note:
     * <br/>
     * You may assume the string contains only lowercase alphabets.
     * <br/>
     * O(n*log(n)) time complexity & O(1) space complexity
     * @param s a String
     * @param t a String
     * @return boolean denoting outcome of evaluation
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr= t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}
