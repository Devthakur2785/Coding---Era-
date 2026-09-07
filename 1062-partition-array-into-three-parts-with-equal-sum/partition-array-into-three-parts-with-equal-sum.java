class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        if(totalsum%3!=0) return false;
        
        int sum=0;
        int target=totalsum/3;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        
        if(sum==target) {
            count++;
            sum=0;

            }
        }
        if(count>=3)return true;
        
    return false;
    }
}