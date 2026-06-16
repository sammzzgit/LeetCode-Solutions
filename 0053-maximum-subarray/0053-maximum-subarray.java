class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int high = 0;
        int max = Integer.MIN_VALUE;

        while(high < nums.length){
            sum = sum + nums[high];
            max = Math.max(max, sum);

            if(sum < 0) sum = 0;
            high++;
        }
        return max;
    }
}