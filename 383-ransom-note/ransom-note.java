class Solution {
    public boolean canConstruct(String r, String m) {
        int []arr=new int[26];
        // int []arr2=new int[26];
        // for(int i=0;i<r.length();i++){
        //     arr[r.charAt(i)-'a']++;
        // }
        // for(int j=0;j<m.length();j++){
        //     arr2[m.charAt(j)-'a']++;
        // }
        // for(int i=0;i<26;i++){
        //     if(arr[i]>arr2[i]){
        //         return false;
        //     }
        // }
        // return true;
        // 2nd method
        // for(char ch:m.toCharArray()){
        //     arr[ch-'a']++;
        // }
        // for(char ch:r.toCharArray()){
        //     arr[ch-'a']--;
        //     if(arr[ch-'a']<0)return false;
        // }
        // return true;

        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:m.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:r.toCharArray()){
            if(!map.containsKey(ch)) return false;
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.get(ch)<0)
            return false; 
        }
        return true;
    }
}