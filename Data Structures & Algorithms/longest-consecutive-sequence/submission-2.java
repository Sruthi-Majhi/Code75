class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int n = nums.length;
         HashSet<Integer> set = new HashSet<>();
         int ans = 1, maxAns = 1;
         for(int num : nums)
         {
            set.add(num);
         }
         for(int i = 0; i < n; i++)
         {
            ans = 1;
            if(!set.contains(nums[i] - 1))   
            {
                while(set.contains(++nums[i]))
                ans++;

            }
            maxAns = Math.max(ans, maxAns);

         }
         return maxAns;
    }
}
