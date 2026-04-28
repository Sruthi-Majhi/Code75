class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> dup = new HashSet<>();
        int n =  nums.length;
        for(int i = 0; i < n; i++)
        {
            Set<Integer> st = new HashSet<>();
            for(int j = i + 1; j < n; j++)
            {
                int third = - (nums[i] + nums[j]);
                if(st.contains(third))
                {
                 List<Integer> lt = Arrays.asList(nums[i], nums[j], third);
                   lt.sort(null);
                   dup.add(lt);
                }
                st.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(dup);
        return ans;
    }
}
