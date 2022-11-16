/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        
        // parse through array and check hashmap for other value
        for (int i = 0; i < nums.length; i++) {
            int curVal = nums[i];
            if (numMap.containsKey(target - curVal)) {
                // if the subtracted value is in the hashmap, break
                output[0] = numMap.get(target-curVal);
                output[1] = i;
                break;
            }
            // if not, put current value in map
            numMap.put(curVal, i);
        }
        // return the index of each value as an array
        return output;
    }
}
