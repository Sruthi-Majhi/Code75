class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        List<int[]> sr = new ArrayList<>();

        for(Map.Entry<Integer, Integer> ent : mpp.entrySet())
        {
            sr.add(new int[] {ent.getValue(), ent.getKey()});
        }
        sr.sort((a, b) -> a[0] - b[0]);

        int [] res = new int[k];
        for(int i = mpp.size() - 1; i >= mpp.size() - k; i--)
        {
            res[mpp.size()-i -1] = sr.get(i)[1];
        }
        return res; 

    }
}
