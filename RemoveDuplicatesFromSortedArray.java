class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int length = nums.length;

        for (int i = 0; i < length-1; i++) {

            int curVal = nums[i];
            int nextVal = nums[i+1];

            if (curVal == nextVal) {
                count++;

                for (int j = i+1; j < length-1; j++) {
                    nums[j] = nums[j+1];
                }

                length--;
                nums[nums.length - count] = 0;
                i--;
            }
        }
        
        return nums.length - count;
    }
}
