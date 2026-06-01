class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charCounts = new HashMap<Character, Integer>();
        char[] ch = magazine.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (charCounts.containsKey(ch[i])) {
                int currentCount = charCounts.get(ch[i]);
                charCounts.put(ch[i], currentCount + 1);
            } else {
                charCounts.put(ch[i], 1);
            }
        }

        char[] rn = ransomNote.toCharArray();
        for (int i = 0; i < rn.length; i++) {
            if (charCounts.containsKey(rn[i])) {
                int currentCount = charCounts.get(rn[i]);
                if(currentCount > 0){
                charCounts.put(rn[i], currentCount - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}