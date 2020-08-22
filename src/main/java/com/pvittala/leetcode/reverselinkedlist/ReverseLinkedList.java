package com.pvittala.leetcode.reverselinkedlist;

/**
 * LeetCode Reverse Linked List problem.
 * @author Pavan Vittala
 */
public class ReverseLinkedList {
    /**
     * Reverse a singly linked list, iterative implementation.
     * @param head the head of the linked list
     * @return the new head
     */
    public static ListNode reverseListIteratively(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;
        while (second != null) {
            ListNode third = second.next;
            second.next = first;
            first = second;
            second = third;
        }
        head.next = null;
        return first;
    }
}
