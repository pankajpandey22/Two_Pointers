class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length<3) return nums.length;

        int l = 0;
        int count=1;

        for (int r=1; r<nums.length; r++) {

            if (nums[r]==nums[r-1]) {
                if (count<2) {
                    l++;
                    nums[l] = nums[r];
                }
                count++;
            }

            else {
                count=1;
                l++;
                nums[l] = nums[r];
            }

        }
        return l+1;
    }
} 
