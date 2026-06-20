class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k && j != i && k != i) {
                List<Integer> subres = new ArrayList<>();
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    subres.add(nums[i]);
                    subres.add(nums[j]);
                    subres.add(nums[k]);
                    if(!result.contains(subres))
                    result.add(subres);
                }
                if(sum>0){
                    k--;
                } else{
                    j++;
                }
                
            }
        }
        return result;
    }
}