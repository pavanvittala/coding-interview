package com.pvittala.leetcode.majorityelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void majorityElementOddLengthArray() {
        int[] input = {10, 20, 30, 40, 50, 1, 1, 1, 1, 1, 1};
        int actual = MajorityElement.majorityElement(input);
        assertEquals(1, actual);
    }

    @Test
    void majorityElementEvenLengthArray() {
        int[] input = {10, 20, 30, 40, 1, 1, 1, 1, 1, 1};
        int actual = MajorityElement.majorityElement(input);
        assertEquals(1, actual);
    }

    @Test
    void majorityElementSingleElement() {
        int[] input = {1};
        int actual = MajorityElement.majorityElement(input);
        assertEquals(1, actual);
    }
}
