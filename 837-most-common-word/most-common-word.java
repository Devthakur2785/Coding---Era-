class Solution {
    public String mostCommonWord(String s, String[] banned) {
        s=s.toLowerCase();
        String[] st=s.split("[^a-z]+");
        HashMap<String,Integer>map=new HashMap<>();

        for(String w:st){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        for(String w:banned){
            map.remove(w);
        }
        String ans="";
        int max=0;
        for(String w:map.keySet()){
            if(map.get(w)>max){
                max=map.get(w);
                ans=w;
            }
        }
        return ans;
    }
}