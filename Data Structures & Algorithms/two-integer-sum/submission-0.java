class Solution {
	public int[] twoSum(int[] nums, int target) {
HashMap<Integer,Integer> ops = new HashMap<Integer,Integer>();
        Integer diff;
        for(int i=0;i<nums.length;i++)
        {
        	diff = target - nums[i];
            if(ops.containsKey(diff)) {
            	 int[] res = {ops.get(diff),i};
            	return res;
            } else {
            	ops.put(nums[i] , i);
            }
        }
        return nums;
    }
}
