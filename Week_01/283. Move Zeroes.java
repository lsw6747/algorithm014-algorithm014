package result;

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                if (left != i){
                    nums[left] = nums[i];
                    nums[i] = 0;
                    left++;
                }
            }
        }
    }
}