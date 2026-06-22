class Solution {
    public int trap(int[] height) {
        int prefix[] = new int[height.length];
        int suffix[] = new int[height.length];
        int maxPrefix = 0, maxSuffix = 0, result = 0;

        for (int i = 0; i < height.length; i++) {
            if (height[i] >= maxPrefix) {
                prefix[i] = height[i];
                maxPrefix = height[i];
            } else {
                prefix[i] = maxPrefix;
            }
        }

        for (int i = height.length - 1; i >= 0; i--) {
            if (height[i] >= maxSuffix) {
                suffix[i] = height[i];
                maxSuffix = height[i];
            } else {
                suffix[i] = maxSuffix;
            }
        }

        for(int i=0;i<height.length;i++){
            int temp = Math.min(suffix[i],prefix[i]);
            result += temp - height[i];

        }
        return result;
    }
}
