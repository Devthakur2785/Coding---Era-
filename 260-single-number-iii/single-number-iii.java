class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2) return nums;
        Arrays.sort(nums);
        int []arr=new int[2];
        int idx=0;
         for(int i=0;i<nums.length;i++){
            if(i+1<nums.length && nums[i]==nums[i+1]){
                i++;
            }else{
                arr[idx]=nums[i];
                idx++;
            }
         }
         return arr;
    }
}