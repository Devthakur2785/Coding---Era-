class Solution {
    public boolean canConstruct(String r, String m) {
        int []arr=new int[26];
        int []arr2=new int[26];
        for(int i=0;i<r.length();i++){
            arr[r.charAt(i)-'a']++;
        }
        for(int j=0;j<m.length();j++){
            arr2[m.charAt(j)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>arr2[i]){
                return false;
            }
        }
        return true;
    }
}