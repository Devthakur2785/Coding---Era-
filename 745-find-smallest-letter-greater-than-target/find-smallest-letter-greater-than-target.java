class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min=Integer.MAX_VALUE;
        char ans=letters[0];
        for(int i=0;i<letters.length;i++){
            if(letters[i]-'a'> target-'a' && letters[i]-'a' < min){
                min=letters[i]-'a';
                ans=letters[i];
            }
        }
        return ans;
    }
}