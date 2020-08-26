package com.pvittala.leetcode.validanagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void isAnagramTest1() {
        String s = "anagram", t = "nagaram";
        boolean actual = ValidAnagram.isAnagram(s, t);
        assertTrue(actual);
    }

    @Test
    void isAnagramTest2() {
        String s = "rat", t = "car";
        boolean actual = ValidAnagram.isAnagram(s, t);
        assertFalse(actual);
    }

    @Test
    void isAnagramTest3() {
        String s = "aacc", t = "ccac";
        boolean actual = ValidAnagram.isAnagram(s, t);
        assertFalse(actual);
    }

    @Test
    void isAnagramTest4() {
        String s = "aa", t = "bb";
        boolean actual = ValidAnagram.isAnagram(s, t);
        assertFalse(actual);
    }
}
