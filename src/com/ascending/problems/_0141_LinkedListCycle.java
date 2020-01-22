package com.ascending.problems;

public class _0141_LinkedListCycle {
    /**
     * Definition for singly-linked list.
     **/

    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) return false;

            ListNode slow = head;
            ListNode fast = head.next;

            while (slow != fast){
                if (fast == null || fast.next == null) return false;
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }
    }
}
