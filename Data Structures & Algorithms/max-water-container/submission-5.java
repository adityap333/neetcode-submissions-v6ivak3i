class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1, fill = 0, bucket = 0;
        while (i < j) {
            bucket = Math.min(heights[i], heights[j]);
            int tmp = (j-i) * bucket;
            if(tmp > fill) fill = tmp;
            if(heights[i] > heights[j]){
                j--;
            } else {
                i++;
            }
        }
        return fill;
    }
}
