class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rem = target - nums[i];
            if (mpp.containsKey(rem)) {
                ans[0] = mpp.get(rem);
                ans[1] = i;

            }

            else {
                mpp.put(nums[i], i);
            }
        }

        return ans;
    }
}
