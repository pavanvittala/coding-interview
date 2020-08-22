package com.pvittala.leetcode.deletenodeinalinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeInALinkedListTest {

    @Test
    void deleteHeadInSizeTwoLinkedList() {
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        System.out.println("Deleting "+head.val);
        System.out.println("Before: "+linkedListToString(head));

        DeleteNodeInALinkedList.deleteNode(head);
        System.out.println("After: "+linkedListToString(head));
        assertEquals(10, head.val);
        assertNull(head.next);
    }

    @Test
    void deleteHeadInSizeThreeLinkedList() {
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.next = new ListNode(15);
        System.out.println("Deleting "+head.val);
        System.out.println("Before: "+linkedListToString(head));

        DeleteNodeInALinkedList.deleteNode(head);
        System.out.println("After: "+linkedListToString(head));
        assertEquals(10, head.val);
        assertNotNull(head.next);
        assertEquals(15, head.next.val);
        assertNull(head.next.next);
    }

    @Test
    void deleteSecondNodeInSizeThreeLinkedList() {
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.next = new ListNode(15);
        System.out.println("Deleting "+head.next.val);
        System.out.println("Before: "+linkedListToString(head));

        DeleteNodeInALinkedList.deleteNode(head.next);
        System.out.println("After: "+linkedListToString(head));
        assertEquals(5, head.val);
        assertNotNull(head.next);
        assertEquals(15, head.next.val);
        assertNull(head.next.next);
    }

    /**
     * Prints the contents of a Linked List from the given node onwards.
     * @param node the provided node
     * @return {@link String} representing the Linked List
     */
    private String linkedListToString(ListNode node) {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (node != null) {
            sb.append(node.val);
            if (node.next != null) {
                sb.append(", ");
            }
            node = node.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
