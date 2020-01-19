package com.ascending.algorithms.binary_search;

public class _0033_SearchInRotatedSortedArray {

    /*
    Solution1: A modified binary search.
    There are two scenarios: target is on the left side of mid; target is on the right side of mid.

    1. target is on the left side of mid:
    nums[0] <= target < nums[mid] or nums[mid] < nums[0] <= target or target < nums[mid] < nums[0]
    So we move high to (mid - 1) here.

    2. target is on the right side of mid:
    low = mid + 1

    Time: O(log n)
    Space: O(1)
    */

    class Solution1 {
        public int search(int[] nums, int target) {
            int low = 0, high = nums.length - 1;
            while (low <= high){
                int mid = (low + high) / 2;
                if (nums[mid] == target) return mid;
                else if ((nums[0] <= target && target < nums[mid]) || (nums[mid] < nums[0] && nums[0] <= target) || (target < nums[mid] && nums[mid] < nums[0])) high = mid -1;
                else low = mid + 1;
            }
            return -1;
        }
    }

    /*
    Solution2: Same idea here, the difference is that we write the conditions in another way.
    */

    class Solution2 {
        public int search(int[] nums, int target) {
            int low = 0, high = nums.length - 1;
            while (low <= high){
                int mid = (low + high) / 2;
                if (nums[mid] == target) return mid;

                else if (nums[mid] <= nums[high]){
                    if (nums[mid] < target && target <= nums[high]) low = mid + 1;
                    else high = mid - 1;
                }

                else if (nums[mid] >= nums[low]){
                    if (nums[low] <= target && target < nums[mid]) high = mid - 1;
                    else low = mid + 1;
                }
            }
            return -1;
        }
    }
}
