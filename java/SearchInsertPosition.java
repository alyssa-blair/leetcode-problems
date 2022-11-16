class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (cur >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
