class Solution {
    public int findDuplicate(int[] nums) {
        int start = 0;
        while(true)
        {
            if(nums[start] == 0)
            return start;
            int val = start;
            start = nums[start];
            nums[val] = 0;
        }
       
    }
}
