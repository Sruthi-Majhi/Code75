class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();
        for(int i : nums)
        {
            if(st.contains(i))
            return true;

            st.add(i);
        }

        return false;
    }
}