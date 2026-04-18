class Solution {
    public int largestUniqueNumber(int[] nums) {
        Arrays.sort(nums);
        
        int largestNum = nums[nums.length - 1];
        boolean isDuplicate = false;

        for(int inx = nums.length -2; inx >=0; inx--)
        {
            if(largestNum > nums[inx] && !isDuplicate)
                break;
            else if(largestNum == nums[inx])
                isDuplicate = true;
            else
            {
                largestNum = nums[inx];
                isDuplicate = false;
            }
        }

        if(isDuplicate)
            largestNum = -1;
        
        return largestNum;
    }
}
