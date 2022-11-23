/*
Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, 
you must instead have the result be placed in the first part of the array nums. 
More formally, if there are k elements after removing the duplicates, 
then the first k elements of nums should hold the final result. 
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying 
the input array in-place with O(1) extra memory.
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int length = nums.length;

        for (int i = 0; i < length-1; i++) {
            // take the current and next value in the array
            int curVal = nums[i];
            int nextVal = nums[i+1];

            if (curVal == nextVal) {
                // if they are equal, add to the count
                count++;

                for (int j = i+1; j < length-1; j++) {
                    // shift the array to remove the repeated value
                    nums[j] = nums[j+1];
                }
                
                // adjust the index and length of the array and set the last untouched value to 0
                length--;
                nums[nums.length - count] = 0;
                i--;
            }
        }
        
        return nums.length - count;
    }
}
