package com.pvittala.leetcode.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Fizz Buzz problem.
 * @author Pavan Vittala
 */
public class FizzBuzz {
    /**
     * Write a program that outputs the string representation of numbers from 1 to n.
     * <br/>
     * But for multiples of three it should output “Fizz” instead of the number and for
     * the multiples of five output “Buzz”. For numbers which are multiples of both three
     * and five output “FizzBuzz”.
     * @param n number to process up to
     * @return {@link List} containing the desired output
     */
    public static List<String> fizzBuzz(final int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i<=n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(""+i);
            }
        }
        return list;
    }
}
