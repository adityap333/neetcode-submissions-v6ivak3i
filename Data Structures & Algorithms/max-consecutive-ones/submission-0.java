class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int count = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 1){
                ones++;
            }  
            if(ones > count){
                count = ones;
            }  
            if (nums[i] == 0){
                ones = 0;
            }
        }
        return count;
    }
}