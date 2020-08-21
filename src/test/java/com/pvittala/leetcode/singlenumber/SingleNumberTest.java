package com.pvittala.leetcode.singlenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void singleNumberTest1() {
        int[] nums = {1, 2, 4, 10, 10, 2, 1};
        int actual = SingleNumber.singleNumber(nums);
        assertEquals(4, actual);
    }

    @Test
    void singleNumberTest2() {
        int[] nums = {100, 200, 100};
        int actual = SingleNumber.singleNumber(nums);
        assertEquals(200, actual);
    }
}
