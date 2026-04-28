class Solution {
    public int rob(int[] nums) {
       int n = nums.length, one = 0, two = 0;
       for(int i = 0; i < n; i++)
       {
        int temp  = two;
        two = Math.max(two, nums[i] + one);
        one = temp;

       }
       return Math.max(one, two);


    }
}
