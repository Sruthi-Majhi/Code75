class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
       HashMap<Integer, Integer> mpp = new HashMap<>();
       int [] ans = new int[2];
       for(int i = 0; i < n; i++)
       {
        int required = target - nums[i];
        if(mpp.containsKey(required))
        {
            ans[0] = mpp.get(required);
            ans[1] = i;
            break;
        }
        mpp.put(nums[i], i);
       }
       return ans;

       
    }
}
