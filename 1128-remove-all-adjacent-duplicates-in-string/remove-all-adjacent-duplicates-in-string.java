class Solution {
    public String removeDuplicates(String s) {
        //  StringBuilder st = new StringBuilder();

        // for (char ch : s.toCharArray()) {
        //     if (st.length() > 0 && st.charAt(st.length() - 1) == ch)
        //         st.deleteCharAt(st.length() - 1);
        //     else
        //         st.append(ch);
        // }

        // return st.toString();
  
      Stack<Character>st=new Stack<>();
      for(char c:s.toCharArray())
      if(st.isEmpty() || st.peek()!=c ){
        st.push(c);
      }else{
        st.pop();
      }
      String a="";
      
      while(!st.isEmpty()){
        a = st.pop() +a;
      }
      return a;
    }
}