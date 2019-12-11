package com.ascending.problems;

public class _0034_FindFirstAndLastPositionOfElementInSortedArray {

    /*
    Solution 1:binary Search
    Use two functions 'findFirst' & 'findSecond' to find the start and end position of the target (if existed).
    Time: O(log n)
    Space: Constant
    */
    class Solution1 {
        public int[] searchRange(int[] nums, int target) {
            int[] result = new int [2];
            result[0] = findFirst(nums, target);
            result[1] = findSecond(nums, target);
            return result;
        }

        private int findFirst(int[] nums, int target){
            int idx = -1;
            int low = 0, high = nums.length - 1;
            while (low <= high){
                int mid = low + (high - low)/2;
                if (nums[mid] >= target){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
                if (nums[mid] == target) idx = mid;
            }
            return idx;
        }

        private int findSecond(int[] nums, int target){
            int idx = -1;
            int low = 0, high = nums.length - 1;
            while (low <= high){
                int mid = low + (high - low)/2;
                if (nums[mid] > target){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
                if (nums[mid] == target) idx = mid;
            }
            return idx;
        }
    }

    /*
    Solution 2: binary search
    The 'binarySearch' function returns the insert position for a given target, telling me the first index
    where I could insert a given number into nums to keep it sorted.

    Thus, if nums contains target, I can find the first occurrence with search(target).
    I do that, and if target isn't actually there, then I return [-1, -1].

    Otherwise, I ask binarySearch(target+1), which tells me the first index where I could insert target+1,
    which of course is one index behind the last index containing target, so all I have left to do is subtract 1.

    Time: O(log n)
    Space: constant
    */

    class Solution2 {
        public int[] searchRange(int[] nums, int target) {
            int[] result = new int [2];
            result[0] = binarySearch(nums, target);
            if (result[0] < nums.length && nums[result[0]] == target){
                result[1] = binarySearch(nums, target + 1) - 1;
                return result;
            }else{
                return new int[]{-1,-1};
            }
        }

        private int binarySearch(int[] nums, int target){
            int low = 0, high = nums.length - 1;
            while (low <= high){
                int mid = low + (high - low)/2;
                if (nums[mid] >= target){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
            }
            return low;
        }
    }

}
