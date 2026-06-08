class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0,i=0;
        while (count < s.length() && i < t.length()) {
            if (t.charAt(i) == s.charAt(count)) {
                count++;
            }
            i++;
        }
        return count == s.length();
    }
}