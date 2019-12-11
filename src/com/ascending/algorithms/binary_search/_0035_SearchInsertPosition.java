package com.ascending.algorithms.binary_search;

public class _0035_SearchInsertPosition {

    /*
    Solution 1: Binary search.
    Time: O(log n), n = length of array
    Space: constant
    */

    class Solution1 {
        public int searchInsert(int[] nums, int target) {
            int low = 0, high = nums.length - 1;
            while(low <= high){
                int mid = low + (high - low) / 2; // low <= mid, mid < high
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target) high = mid - 1;
                else low = mid + 1;
            }
            return low;
        }
    }

    /*
    Solution 1: Binary search.
    Time: O(n), n = length of array
    Space: constant
    */

    class Solution2 {
        public int searchInsert(int[] nums, int target) {
            int len = nums.length;
            for (int i = 0; i < len; i ++){
                if (target <= nums[i]){
                    return i;
                }
            }
            return len;
        }
    }

}
