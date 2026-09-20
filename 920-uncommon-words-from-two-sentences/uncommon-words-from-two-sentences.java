class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s = s1 + " " + s2;
        String[] words = s.split(" ");
        int[] freq = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    freq[i]++;
                }
            }
        }
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (freq[i] == 1)
                ans.add(words[i]);
        }
        return ans.toArray(new String[0]);
    }
}