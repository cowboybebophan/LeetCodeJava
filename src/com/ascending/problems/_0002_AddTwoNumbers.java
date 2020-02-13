package com.ascending.problems;

public class _0002_AddTwoNumbers {
    /** Definition for singly-linked list. **/

    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode cur = new ListNode(0);
            ListNode dummy = cur;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0){
                carry += l1 == null ? 0 : l1.val;
                l1 = l1 == null ? null : l1.next;

                carry += l2 == null ? 0 : l2.val;
                l2 = l2 == null ? null : l2.next;

                cur.next = new ListNode(carry % 10);
                cur = cur.next;
                carry = carry / 10;
            }
            return dummy.next;
        }
    }
}
