/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
*/

class Solution {
    public int pivotIndex(int[] nums) {

        int right = 0;
        int left = 0;

        // take the sum of the right array
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }

        if (right == 0) {
            // check first case
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            // add new value to left array and subtract value at pivot from right
            left += nums[i-1];
            right -= nums[i];
   
            if (left == right) {
                // if they are equal, return the index
                return i;
            }
        }
        // they were never equal, so return -1
        return -1;
        
    }
}
