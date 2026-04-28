class Solution {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;
        int max1 = 0,  max2 = 0;

        if(nums.length == 1) return nums[0];

        for(int i = 0; i < nums.length - 1; i++)
        {
            int temp = rob2;
            rob2 = Math.max(rob1 + nums[i], rob2);
            rob1 = temp;


        }
        max1 = Math.max(rob1, rob2);
        rob2 = 0;
        rob1 = 0;


        for(int i = 1; i < nums.length; i++)
        {
            int temp = rob2;
            rob2 = Math.max(rob1 + nums[i], rob2);
            rob1 = temp;


        }

        max2 = Math.max(rob1, rob2);

        return Math.max(max1, max2);


    }
}
