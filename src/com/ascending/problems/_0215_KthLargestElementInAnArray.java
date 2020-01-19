package com.ascending.problems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _0215_KthLargestElementInAnArray {
    // https://leetcode.com/problems/kth-largest-element-in-an-array/discuss/60294/Solution-explained

    // 1. Brute Force
    // O(N log N) running time + O(1) memory
    class Solution1 {
        public int findKthLargest(int[] nums, int k) {
            int N = nums.length;
            Arrays.sort(nums);
            return nums[N-k];
        }
    }

    // 2. Priority Queue (implemented with min-heap in Java)
    // O(N log k) running time + O(k) memory
    class Solution2 {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue();
            for (int val : nums){
                pq.offer(val);

                if (pq.size() > k) {
                    pq.poll();
                }
            }
            return pq.peek();
        }
    }

    // 3. QuickSelect
    // Average O(N), worst O(N * N) + O(1) memory
    class Solution3 {
        public int findKthLargest(int[] nums, int k) {
            quickSelect(nums, 0, nums.length - 1, k);
            return nums[k-1];
        }

        public void quickSelect(int[] nums, int low, int high, int k){
            if (low < high) {
                int p = partition(nums, low, high);
                if (p == k-1) return;
                else if (p > k-1) quickSelect(nums, low, p - 1, k);
                else quickSelect(nums, p + 1, high, k);
            }
        }

        public int partition(int[] nums, int low, int high){
            int pivot = nums[high];
            int i = low;

            for (int j = low; j < high; j ++){
                if (nums[j] > pivot){
                    swapValue(nums, i, j);
                    i++;
                }
            }
            swapValue(nums, i, high);
            return i;
        }

        public void swapValue(int[] nums, int i, int j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }

}
