/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
*/


class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < i; j++) {
                // add the current left values to the left sum
                left += nums[j];
            }
            
            for (int j = nums.length-1; j > i; j--) {
                // add the current right values to the right sum
                right += nums[j];
            }
            
            if (left == right) {
                // if the left and right sum are equal, return the index
                return i;
            }
        }
        // if there was no equal point, return -1
        return -1;
    }
}
