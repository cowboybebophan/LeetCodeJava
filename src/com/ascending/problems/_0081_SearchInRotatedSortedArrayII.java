package com.ascending.problems;

public class _0081_SearchInRotatedSortedArrayII {

    class Solution {
        public boolean search(int[] nums, int target) {
            int low = 0, high = nums.length - 1;

            // To handle duplicates
            // 目的是为了能准确判断mid位置，所以算法的最坏时间复杂度为O(n)
            while (low <= high){
                while (low < high && nums[low] == nums[high]){
                    low += 1;
                }

                int mid = (low + high) / 2;
                if (nums[mid] == target) return true;

                else if (nums[mid] >= nums[low]){
                    if (nums[low] <= target && target < nums[mid]) high = mid - 1;
                    else low = mid + 1;
                }

                else if (nums[mid] <= nums[high]){
                    if (nums[mid] < target && target <= nums[high]) low = mid + 1;
                    else high = mid - 1;
                }
            }
            return false;
        }
    }
}
