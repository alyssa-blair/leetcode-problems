class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int cur = nums[i];
            if (cur == val) {
                count++;
                nums = remove(i, nums, length);
                length--;
                i--;
            }
        }
        return length;
    }
    
    public int[] remove(int i, int[] nums, int length) {
        for (int j = i; j < length - 1; j++) {
            nums[j] = nums[j+1];
        }
        return nums;
    }
}
