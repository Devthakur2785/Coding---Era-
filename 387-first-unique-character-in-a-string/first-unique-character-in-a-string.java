class Solution {
    public int firstUniqChar(String s) {
        // 1 method
        //      for (int i = 0; i < s.length(); i++) {
        //     boolean flag=true;
        //     for(int j=0;j<s.length();j++){
        //         if( i!=j && s.charAt(i)==s.charAt(j)){
        //             flag=false;
        //             break;
        //         }
        //     }
        //     if(flag==true){
        //         return i;
        //     }            
        // }
        // return -1;  
        // 2nd method
        // int[]arr=new int[26];
        // for(int i=0;i<s.length();i++){
        //     arr[s.charAt(i)-'a']++;
        // }  
        // for(int i=0;i<s.length();i++){
        //     if(arr[s.charAt(i)-'a']==1){
        //         return i;
        //     }
        // }  
        // return -1;
  HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);   
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }
       return -1; 
    }
}