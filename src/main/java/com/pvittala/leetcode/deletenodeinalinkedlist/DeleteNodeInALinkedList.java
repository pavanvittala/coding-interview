package com.pvittala.leetcode.deletenodeinalinkedlist;

/**
 * LeetCode Delete Node In A Linked List problem.
 * @author Pavan Vittala
 */
public class DeleteNodeInALinkedList {
    /**
     * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
     * <br/>
     * 1. The linked list will have at least two elements.
     * <br/>
     * 2. All of the nodes' values will be unique.
     * <br/>
     * 3. The given node will not be the tail and it will always be a valid node of the linked list.
     * <br/>
     * 4. Do not return anything from your function.
     * @param node the node to delete
     */
    public static void deleteNode(ListNode node) {
        // 1. The trick to this problem is to manipulate the values in the Node,
        // instead of trying to manipulate the next pointers
        // 2. We shuffle the values to the right of the node to be deleted over to
        // the left, and then remove the final node at the end
        ListNode previous = node;
        ListNode current = node;
        while (current.next != null) {
            current.val = current.next.val;
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }
}
