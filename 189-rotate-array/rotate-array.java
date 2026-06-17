class Solution {
    static void fun(int left, int right, int[]nums){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        fun(0, nums.length - 1, nums);
        fun(0, k - 1, nums);
        fun(k, nums.length - 1, nums);
        return;
    }
}