package com.ascending.data_structures.linked_list;

import java.util.ArrayDeque;
import java.util.Deque;

public class _0445_AddTwoNumbersII {
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Deque<Integer> d1 = new ArrayDeque<>();
            Deque<Integer> d2 = new ArrayDeque<>();

            while (l1 != null){
                d1.push(l1.val);
                l1 = l1.next;
            }

            while (l2 != null){
                d2.push(l2.val);
                l2 = l2.next;
            }

            ListNode cur = new ListNode(0);

            int carry = 0;

            while (!d1.isEmpty() || !d2.isEmpty()){
                if (!d1.isEmpty()) carry += d1.pop();
                if (!d2.isEmpty()) carry += d2.pop();

                cur.val = carry % 10;
                ListNode prev = new ListNode(carry / 10);
                prev.next = cur;
                cur = prev;
                carry = carry / 10;
            }
            return cur.val == 0? cur.next:cur ;
        }
    }
}
