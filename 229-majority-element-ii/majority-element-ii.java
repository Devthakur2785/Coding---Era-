class Solution {
    public List<Integer> majorityElement(int[] nums) {
    // List<Integer> result = new ArrayList<>();
    //    int[]arr=new int [10000000];
    //    int i=0;
    //    for(int j=0;j<nums.length;j++){
    //     arr[nums[j]]++;
    //    }
    //    int max=0;
    //    int ans=0;
    //    for(int k=0;k<arr.length;k++){
    //    if(arr[k]>max){
    //     max=arr[k];
    //     ans=k;
    //    }
    //    }
    //    result.add(ans);
       
    //   return result;
    List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {

            int count = 0;

            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }

            if(count > nums.length / 3 && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}