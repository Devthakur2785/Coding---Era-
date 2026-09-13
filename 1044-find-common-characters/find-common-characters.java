class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
 
        String first = words[0];
        for (char ch : first.toCharArray()) {
            boolean found = true;
            for (int i = 1; i < words.length; i++) {
                if (!words[i].contains(ch + "")) {
                    found = false;
                    break;
                }
            }
            if (found) {
                ans.add(ch + "");

            for (int i = 1; i < words.length; i++) {
                words[i] = words[i].replaceFirst(ch + "", "");
                }
            }
        }
        return ans;
    }
}