class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String>s=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(i+j<min){
                        min=i+j;
                        s.clear();
                    s.add(list1[i]);
                    index++;
                    }
                    else if(i+j==min){
                        s.add(list1[i]);
                    }
                }
            }
        }
        return s.toArray(new String[0]);
    }
}