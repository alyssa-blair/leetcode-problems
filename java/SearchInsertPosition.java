/*
Given a sorted array of distinct integers and a target value, 
return the index if the target is found. If not, 
return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
*/


class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (cur >= target) {
                // if we have already reached or passed the target, return the index
                return i;
            }
        }
        // if we never reach or pass the target, element will be at end
        return nums.length;
    }
}
