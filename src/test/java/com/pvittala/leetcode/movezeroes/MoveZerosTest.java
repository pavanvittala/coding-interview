package com.pvittala.leetcode.movezeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    @Test
    void moveZeroesTest1() {
        int[] input = {8, 4, 5, 6, 0, 1, 0, 0};
        MoveZeros.moveZeroes(input);
        int[] expected = {8, 4, 5, 6, 1, 0, 0, 0};
        assertArrayEquals(expected, input);
    }

    @Test
    void moveZeroesTest2() {
        int[] input = {0, 0, 1, 2, 0, 8, 4, 5, 8};
        MoveZeros.moveZeroes(input);
        int[] expected = {1, 2, 8, 4, 5, 8, 0, 0, 0};
        assertArrayEquals(expected, input);
    }

    @Test
    void moveZeroesTestAllZeroesAtFront1() {
        int[] input = {0, 0, 0, 0, 0, 0, 0, 0, 9};
        MoveZeros.moveZeroes(input);
        int[] expected = {9, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, input);
    }

    @Test
    void moveZeroesTestAllZeroesAtFront2() {
        int[] input = {0, 0, 0, 0, 0, 1, 2, 4, 9};
        MoveZeros.moveZeroes(input);
        int[] expected = {1, 2, 4, 9, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, input);
    }

    @Test
    void moveZeroesTestAllZeroes() {
        int[] input = {0, 0, 0, 0, 0, 0};
        MoveZeros.moveZeroes(input);
        int[] expected = {0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, input);
    }
}
