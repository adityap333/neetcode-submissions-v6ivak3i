class Solution {
    public boolean areSentencesSimilar(
        String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) {
            return false;
        }
        Set<String> set = new HashSet<>();
        for (List<String> pair : similarPairs) {
            String word1 = pair.get(0);
            String word2 = pair.get(1);
            set.add(word1 + "#" + word2);
            set.add(word2 + "#" + word1);
        }
        for (int i = 0; i < sentence1.length; i++) {
            String word1 = sentence1[i];
            String word2 = sentence2[i];
            if (word1.equals(word2)) {
                continue;
            }
            String key = word1 + "#" + word2;
            if (!set.contains(key)) {
                return false;
            }
        }
        return true;
    }
}