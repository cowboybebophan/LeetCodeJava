package com.ascending.problems;

public class _0142_LinkedListCycleII {

    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head, fast = head;

            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast){
                    while (head != slow){
                        head = head.next;
                        slow = slow.next;
                    }
                    return head;
                }
            }
            return null;
        }
    }
}
