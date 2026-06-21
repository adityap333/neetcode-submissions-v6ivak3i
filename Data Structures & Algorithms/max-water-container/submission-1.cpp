class Solution {
public:
    int maxArea(vector<int>& heights) {
        int maxArea = 0;

        int i =0;
        int j = heights.size() - 1;
        while( i != j)
        {            
            int length = std::min(heights[i], heights[j]);
            int breadth = j - i;
            int currentArea = length * breadth;
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