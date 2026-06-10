class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];
        int i = 0, j = 0;
        
        while(i<nums1.length){
            if(nums1[i] == nums2[j]){
                result[i] = j;
                i++;
                j = 0;
            } else {
                j++;
            }
        }
        return result;
    }
}
