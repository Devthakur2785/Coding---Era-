class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        return Math.max(0,nums[nums.length-1]-nums[0]-2*k);
    }
}