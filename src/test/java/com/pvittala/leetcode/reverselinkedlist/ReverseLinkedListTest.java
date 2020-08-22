package com.pvittala.leetcode.reverselinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverseListIterativelyLengthOne() {
        ListNode head = new ListNode(1);
        ListNode newHead = ReverseLinkedList.reverseListIteratively(head);
        assertNotNull(newHead);
        assertEquals(1, newHead.val);
        assertNull(newHead.next);
    }

    @Test
    void reverseListIterativelyLengthTwo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode newHead = ReverseLinkedList.reverseListIteratively(head);
        assertNotNull(newHead);
        assertEquals(2, newHead.val);
        assertNotNull(newHead.next);
        assertEquals(1, newHead.next.val);
        assertNull(newHead.next.next);
    }

    @Test
    void reverseListIterativelyLengthThree() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode newHead = ReverseLinkedList.reverseListIteratively(head);
        assertNotNull(newHead);
        assertEquals(3, newHead.val);
        assertNotNull(newHead.next);
        assertEquals(2, newHead.next.val);
        assertNotNull(newHead.next.next);
        assertEquals(1 , newHead.next.next.val);
        assertNull(newHead.next.next.next);
    }
}
