package com.ascending.problems;

public class _0206_ReverseLinkedList {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    class IterativeSolution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null;
            ListNode cur = head;

            while(cur!= null){
                ListNode copy = cur.next;
                cur.next = pre;
                pre = cur;
                cur = copy;
            }
            return pre;
        }
    }

    class RecursiveSolution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode p = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }
    }
}
