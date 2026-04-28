class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> ent : mpp.entrySet())
        {
            heap.offer(new int[]{ent.getValue(), ent.getKey()});
            if(heap.size() > k)
            heap.poll();
        }

        int [] res = new int[k];
       for(int i = 0; i < k; i++)
       {
        res[i] = heap.poll()[1];
       }
        return res; 

    }
}
