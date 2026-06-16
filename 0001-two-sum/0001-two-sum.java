class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int right = nums.length - 1; right > 0; right--){
            int left = 0;

            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    return new int[]{left, right};
                }
                else 
                    left++;
            }
        }
        return new int[]{-1, -1};

    }
}