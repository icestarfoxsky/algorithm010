class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int m = 0;
        for(int n = 1; n < nums.length; n++) {
            if(nums[m] != nums[n]) {
                m++;
                nums[m] = nums[n];
            }
        }
        return m + 1;
    }
}