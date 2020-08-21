package com.pvittala.leetcode.reversestring;

import com.pvittala.leetcode.reversestring.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseEmptyString() {
        char[] word = {};
        ReverseString.reverseString(word);
        char[] expected = {};
        assertArrayEquals(expected, word);
    }

    @Test
    void reverseLengthOneString() {
        char[] word = {'p'};
        ReverseString.reverseString(word);
        char[] expected = {'p'};
        assertArrayEquals(expected, word);
    }

    @Test
    void reverseEvenString() {
        char[] word = {'w', 'e', 'l', 'l'};
        ReverseString.reverseString(word);
        char[] expected = {'l', 'l', 'e', 'w'};
        assertArrayEquals(expected, word);
    }

    @Test
    void reverseOddString() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        ReverseString.reverseString(word);
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(expected, word);
    }
}
