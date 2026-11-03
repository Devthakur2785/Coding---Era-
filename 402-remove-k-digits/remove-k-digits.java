class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
         while(!st.isEmpty() && k>0){
            st.pop();
            k--;
         }
        String a="";
        while(!st.isEmpty()){
            a=st.pop()+a;
        }
         while(a.length()>0 && a.charAt(0)=='0'){
            a=a.substring(1);
        }
        if(a.length()==0){
            return "0";
        }
       
        return a;
    }
}