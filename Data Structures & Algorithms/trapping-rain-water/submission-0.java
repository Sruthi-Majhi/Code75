class Solution {
    public int trap(int[] height) {
      
        int res = 0, l = 0, r = height.length - 1, leftMax = height[l], rightMax = height[r];

        if(height.length == 0)
        return res;
      while(l <  r)
      {
        if(leftMax < rightMax)
        {
            l++;
            leftMax = Math.max(leftMax, height[l]);
            res += leftMax - height[l];
        }
        else
        {
            r--;
           rightMax = Math.max(rightMax, height[r]);
            res += rightMax - height[r];

        }

                                                                     
      }
      return res;
        
    }
}
