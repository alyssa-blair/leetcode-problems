/*
You are given a non-negative integer array nums. In one operation, you must:

Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
Subtract x from every positive element in nums.
Return the minimum number of operations to make every element in nums equal to 0.

*/

class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        int lowest = findLowest(nums);
        // check if array is done being subtracted
        while (lowest != 0) {
            // subtract the lowest value from every non-zero value in the array
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[i] = nums[i] - lowest;
                }
            }
            lowest = findLowest(nums);
            // add to count for iteration
            count++;
        }
        return count;
        
    }
    
    public int findLowest(int[] nums) {
        int lowest = nums[0];
        // find the lowest value in the array that is not 0
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            if (cur != 0 && (lowest == 0 || cur < lowest)) {
                lowest = cur;
            }
        }
        return lowest;
    }
}
