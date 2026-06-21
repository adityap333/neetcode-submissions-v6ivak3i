class Solution {
public:
    int maxArea(vector<int>& heights) {
        int maxArea = 0;

        int i =0;
        int j = heights.size() - 1;
        while( i != j)
        {            
            int currentArea = (std::min(heights[i], heights[j])) * (j - i);
            if(maxArea < currentArea )
            { 
                maxArea = currentArea;
            }

            if(heights[i] < heights[j] )
            { 
                i++;
            }
            else
            { 
                j--;
            }
        }

        return maxArea;
    }
};