class Solution {
    public int mostFrequentEven(int[] nums) {
        int []arr=new int[100001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++; 
        }
        int max=0;
        int res=-1;
        for(int i=0;i<100001;i++){
           if(i%2==0 && arr[i]>max){
               max=arr[i];
            res=i;
           }
        }
       return res;
    }
}